package pl.jbaranska.comparing.comparing2.ref_method.cars;

import pl.jbaranska.comparing.comparing2.ref_method.cars.Car;

public class CompareByModel {
    int orderByModel (Car first, Car second)
    {
        return first.getModel().compareTo(second.getModel());}

}
