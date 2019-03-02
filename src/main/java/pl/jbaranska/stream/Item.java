package pl.jbaranska.stream;

import java.math.BigDecimal;
import java.util.List;

public class Item {
    private String name;
    private BigDecimal price;
    private List<Ingrediens> ingrediensList;

    public Item(String name, BigDecimal price, List<Ingrediens> ingrediensList) {
        this.name = name;
        this.price = price;
        this.ingrediensList = ingrediensList;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public List<Ingrediens> getIngrediensList() {
        return ingrediensList;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", ingrediensList=" + ingrediensList +
                '}';
    }
}
