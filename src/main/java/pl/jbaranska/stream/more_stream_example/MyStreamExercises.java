package pl.jbaranska.stream.more_stream_example;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class MyStreamExercises {
    public static void main(String[] args) {

        Function<String, List<String>> function = a ->{
            return  Arrays.asList(a.split("a"));
        };

        System.out.println(function.apply("Joanna"));

        BinaryOperator<Integer> bo = (a, b) ->
        {
            return a.compareTo(b);
        };
        System.out.println(bo.apply(7,5));

        List<Integer> il = new ArrayList<>();
        BiFunction<List<Integer>, Integer, List<Integer>> bif =
                (t, a) -> {
                    t.add(a);
                    return t;
                };


        System.out.println(bif.apply(il, 7));
        List<Integer> myList = generateRandomIntegerList();
        //Consumer Exercise
        Consumer <List<Integer>>  consumer =(a) -> {
            for (Integer i:a) {
              //  System.out.println(i);
            }
        } ;
       // consumer.accept(myList);
       // MyStreamExercises.displayList( myList);

         MyStreamExercises.displayList2(a -> {
            for (Integer number:myList
            ) {
               // System.out.println(number +"--");
            }

        }, myList);

        System.out.println(MyStreamExercises.convertStream(myList));
    }

    public static int convertStream(List<Integer> list)
    {
         List<Integer> numbers = new ArrayList<>();
     return   list.stream()
        .reduce ( (o1,o2) -> o1*2)
        .filter(o -> o%2==0)
        .flatMap(o -> Optional.ofNullable(o.intValue()))
        .get();


      //  return 0;
    }
    public static void displayList2(Consumer<List<Integer>> a, List<Integer> list)
    {
        a.accept(list);
    }
    public static void displayList(List<Integer> list)
    {
        Consumer consumer = a -> {
            for (Integer number:list
                 ) {
                System.out.println(number);
            }

            };
        }


    public static List<Integer> generateRandomIntegerList ()
    {
        List<Integer> randomIntegerList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i<100;i++)
        {
            randomIntegerList.add(random.nextInt(10000));
        }
        return randomIntegerList;
    }


}
