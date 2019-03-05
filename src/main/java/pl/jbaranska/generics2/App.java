package pl.jbaranska.generics2;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();
        addCar(vehicleList);
        display(vehicleList);
        rawAdder(vehicleList);

    //    Plane p = vehicleList.get(0);

        List<Plane> planeList = new ArrayList<>();
    }
    //działa takze jesli Vehicle bylo by interfejsem
    public static void display(List<? extends Vehicle> vehicleList)
    {
        vehicleList.forEach(System.out::println);
        vehicleList.forEach(p -> System.out.println(p));

      /*  for(Vehicle vehicle: vehicleList)
        {
            System.out.println(vehicle);
        }
        */
    }
    static void rawAdder(List maybeCar)
    {
        maybeCar.add(new Plane());
    }
    public static void addCar(List<? super Vehicle> vehicleList)
    {
        vehicleList.add(new Car("Auto"));
        vehicleList.add(new Plane("F12"));

    }
}
