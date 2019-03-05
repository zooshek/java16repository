package pl.jbaranska.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import pl.jbaranska.abstract_class.Animal;
import pl.jbaranska.abstract_class.Cat;
import pl.jbaranska.abstract_class.Dog;

public class CollectionsTest {
    public static void main(String[] args) {
        List<Dog> dogs = Arrays.asList( new Dog ("Azor"),new Dog("Pimpek"));
        List<Cat> cats = Arrays.asList( new Cat ("Mruczek"),new Cat("Mialczus"));
        List<Animal> animals = new ArrayList<>();
        addAnimal(animals);

        displayAnimals(dogs);
        displayAnimals(cats);
    }
    //super wyslac od animal w gore do obiecta a dodac wszystko w dol do psa kota
    public static void addAnimal(List<? super Animal> animals)
    {
        animals.add(new Cat("hhh"));
    }
    public static void displayAnimals(List<? extends Animal> animals)
    {

        for (Animal animal: animals)
        {
            System.out.println(animal);
        }
    }
}
