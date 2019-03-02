package pl.jbaranska.stream;

public class Ingrediens {
    private String name;

    public Ingrediens(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Ingrediens{" +
                "name='" + name + '\'' +
                '}';
    }
}
