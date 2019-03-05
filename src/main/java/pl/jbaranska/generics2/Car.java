package pl.jbaranska.generics2;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle {


    public String getName() {
        return name;
    }

    public Car(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
