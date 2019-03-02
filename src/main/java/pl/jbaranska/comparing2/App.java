package pl.jbaranska.comparing2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Object someobject = new Object();
        List<Animal> animalList = Arrays.asList(new Animal("ggg", "nnn", new Object()),
                new Animal("aaa", "aaa", new Object()),
                new Animal("ccc", "ddd", new Object()));

       // Collections.sort(animalList, Comparator.comparing(Animal::getType));
        //System.out.println(animalList.toString());

       // Collections.sort(animalList,(o1, o2) -> o1.compareTo(o2));
        Collections.sort(animalList, Collections.reverseOrder((o1, o2) -> o1.getName().compareTo(o2.getName())));
        System.out.println(animalList.toString());
       // Collections.sort(animalList, (o1, o2) -> o1.getName().compareTo(o2.getName()));
       // System.out.println(animalList.toString());

        //Sort with comparator

        Comparator<Animal> compareAnimal = ( o1,  o2) -> o1.getType().compareTo( o2.getType() );

        Collections.sort(animalList, compareAnimal);
        System.out.println(animalList.toString());

        Collections.sort(animalList, compareAnimal.reversed());
        System.out.println(animalList.toString());

    }
}