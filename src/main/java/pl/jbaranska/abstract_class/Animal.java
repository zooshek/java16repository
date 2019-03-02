package pl.jbaranska.abstract_class;

import java.util.Objects;

public abstract class Animal {
    private String name;
    private  static final int NAME_LEN = 1;

    public Animal(String name) {
        this.name = Objects.requireNonNull(name, "Name is required");
        if (name.length()<NAME_LEN){
            throw new RuntimeException("Name "+name+" is too short, minimal lenght is "+NAME_LEN);
        }
    }
    //2 metody abstakcyjne 2 lambdy
    public abstract void eat();
    public abstract void play();
}
