package pl.jbaranska.comparing.comparing2.ref_method.cars;

import java.time.Year;

public class Car implements Comparable<Car> {
    Integer amount;
    String model;
    String color;
    Year year;

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public Car(Integer amount, String model, String color, Year year) {

        this.amount = amount;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void maybeComparator(Comparable<Car> comparable){
        System.out.println("inside meybeeComparing");
        System.out.println(comparable.compareTo(this));
    }

    @Override
    public String toString() {
        return "Car{" +
                "amount=" + amount +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Car o) {
       // int result = o.compareTo(this);
       // return result;
        //return o.year.getValue() - this.year.getValue();
        return year.compareTo(o.getYear());

    }
}
