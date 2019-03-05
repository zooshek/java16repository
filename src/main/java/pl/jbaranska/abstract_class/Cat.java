package pl.jbaranska.abstract_class;

public class Cat extends Animal {
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    private String name;

    public Cat(String name) {
        super(name);
    }


    @Override
    public void eat() {

    }

    @Override
    public void play() {

    }
}
