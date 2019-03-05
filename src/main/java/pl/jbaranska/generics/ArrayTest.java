package pl.jbaranska.generics;

import pl.jbaranska.abstract_class.Animal;
import pl.jbaranska.abstract_class.Cat;
import pl.jbaranska.abstract_class.Dog;

public class ArrayTest {
    public static void main(String[] args) {
        Cat[] cats = new Cat[2];
        cats[0] = new Cat("Kot1");
        cats[1] = new Cat("Kot2");
        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog("Pies1");
        dogs[1] = new Dog("Pies2");

        Animal[] animals = dogs;
        Object[] objects = animals;
        addDogs(dogs);
        addDogs(cats);
        displayAnimals(dogs);
        displayAnimals(cats);



    }
    public static void displayAnimals(Animal[] animals)
    {
        for (Animal animal: animals){
            System.out.println(animal);
        }
    }

    public static void addDogs( Animal[] animals)
    {
        animals[0] = new Dog("new one");
    }
    public static void addCats(Animal[] animals)
    {
        animals[0] = new Cat("new cat");
    }
}
