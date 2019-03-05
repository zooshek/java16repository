package pl.jbaranska.generics2;

public class Plane extends Vehicle {
    private String name;

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
    public Plane(){}
    public Plane(String name) {
        this.name = name;
    }
}
