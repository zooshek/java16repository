package pl.jbaranska.comparing.comparing2.ref_method.cars;

import java.time.Year;
import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(100, "Volvo", "bleu", Year.of(2000)));
        carList.add(new Car(0, "Fiat", "yellow", Year.of(2013)));
        carList.add(new Car(67, "Honda", "black", Year.of(2019)));
        carList.add(new Car(115, "Mrcedes", "white", Year.of(2005)));
        carList.add(new Car(88, "Fiat", "white", Year.of(2007)));
        carList.add(new Car(98, "Volvo", "green", Year.of(2010)));

        Car carCompare = new Car(20,"Auto", "black", Year.of(1999));


        carCompare.maybeComparator(c -> 1);


       // System.out.println(carList);
        Collections.sort(carList,((o1, o2) -> o1.getColor().compareTo(o2.getColor())));

      //  System.out.println(carList);

        Collections.sort(carList, Car::compareTo);
       // System.out.println(carList);

        Collections.sort(carList, new CarBrandComparator());
        System.out.println(carList);


        Collections.sort(carList, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
               return o1.getModel().compareTo(o2.getModel());
            }
        });

        Collections.sort(carList, (o1,o2) -> o1.getAmount().compareTo(o2.getAmount()));

        ////////////////////////////////////////////////
        CompareByModel anotherWay = new CompareByModel();
        carList.sort((car1,car2) -> {
            return anotherWay.orderByModel(car1,car2);
        });

        carList.sort((c1,c2) -> anotherWay.orderByModel(c1,c2));
        carList.sort(anotherWay::orderByModel);

        carList.sort((c1,c2) -> CarSort.orderByColorNextYearNextModel(c1,c2));
        System.out.println(carList);

        carList.sort(CarSort::orderByColorNextYearNextModel);

        System.out.println(carList);


        carList.sort(Comparator.comparing(Car::getModel).thenComparing(Car::getYear).thenComparing(Car::getColor).thenComparing(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.year.getValue()+20;
            }
        }));
      //  carList.sort((Comparator<Car>)
        //             ((o1,o2) -> o1.getModel().compareTo(o2.getModel())));
}}
