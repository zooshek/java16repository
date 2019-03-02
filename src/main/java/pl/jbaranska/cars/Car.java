package pl.jbaranska.cars;

public class Car {
    Integer amount;
    String model;
    String color;

    public Car(String name, Integer amount, String model, String color) {

        this.amount = amount;
        this.model = model;
        this.color = color;
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
}
