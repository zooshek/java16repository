package pl.jbaranska.stream;

import java.util.List;

public class Order
{
    List<Item>  myItems;

    public Order(List<Item> myItems) {
        this.myItems = myItems;
    }

    public List<Item> getMyItems() {
        return myItems;
    }

    @Override
    public String toString() {
        return "Order{" +
                "myItems=" + myItems +
                '}';
    }
}
