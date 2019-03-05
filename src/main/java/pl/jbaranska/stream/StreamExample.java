package pl.jbaranska.stream;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class StreamExample {
    //TODO: refactor

    public static void main(String[] args) {


        List<Item> saturdayItems = Arrays.asList(
                new Item("kino", BigDecimal.valueOf(35.00),
                        Arrays.asList(new Ingrediens("paper"))),
                new Item("chlebek", BigDecimal.valueOf(15.00),
                        Arrays.asList(new Ingrediens("sugar"), new Ingrediens("H2O"))

                ));
        Order saturdayShopping = new Order(saturdayItems);

      //  System.out.print(getIngredientsNames2(Arrays.asList(saturdayShopping)));

        List<Item> sundayItems = Arrays.asList(
                new Item("cola", BigDecimal.valueOf(4.50),
                        Arrays.asList(new Ingrediens("uran"))),
                new Item("meat", BigDecimal.valueOf(15.00),
                        Arrays.asList(new Ingrediens("e52"), new Ingrediens("c76"))

                ));
        Order sundayShopping = new Order(sundayItems);
       // System.out.print(getIngredientsNames(Arrays.asList(sundayShopping)));
      //  System.out.println(getTotalPrice(sundayShopping));
    }

    public static List<String> getIngredientsNames(List<Order> orders){

        return   orders.stream()
                .flatMap(order -> order.getMyItems().stream()) //strumien items List
                .flatMap(item -> item.getIngrediensList().stream())
                .map(ingredien -> ingredien.getName())
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<String> getIngredientsNames2(List<Order> orders){
        List<String> list = new ArrayList<>();

            return
           orders.stream()
                .flatMap(order -> order.getMyItems().stream()) //strumien items List
                .flatMap(item -> item.getIngrediensList().stream())
                .map(ingredien -> ingredien.getName())
                .distinct()
                   //identity zbiornik do ktorego wrzucamy elementy

                .reduce( list,
                        //strumien stringow , element strumienia
                        ( string, s )->{ string.add(s);
                            System.out.println(string);
                            return string;
                        }
                           //combinator}
                            ,((strings, strings2) -> {
                                strings.addAll(strings2);
                                return strings;
                        }));


    //    return Collections.EMPTY_LIST;

              //  .collect(Collectors.toList());
    }
    public static BigDecimal getTotalPrice(List<Order> orders)
    {
        return
        orders.stream()
                .flatMap(order -> order.getMyItems().stream())
                .map(price -> price.getPrice())

                //reduce(pierwszy parametr liczba poczatkowa )
                .reduce(BigDecimal.ZERO,(a,b) -> a.add(b));
    }
}
