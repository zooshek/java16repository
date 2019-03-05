package pl.jbaranska.generics;

import pl.jbaranska.abstract_class.Animal;

//przyjmujemy zwierze zwraca animal dog cat

public class MySecondGeneric<T> {
//public class MySecondGeneric<T extends Animal> {
 //   public class MySecondGeneric<T super Animal> {
    private T object;

    @Override
    public String toString() {
        return "MySecondGeneric{" +
                "name=" + object +
                '}';
    }

    public T getName() {
      //  object.play();
       // object.hahahau();
        return object;
    }

    public MySecondGeneric(T object) {
        this.object = object;
    }
}
