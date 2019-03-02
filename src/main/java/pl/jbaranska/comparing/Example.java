package pl.jbaranska.comparing;

import java.util.*;

public class Example {
    public static void main(String[] args) {


    List<Person> personList = Arrays.asList(new Person("Jan", "K.", 49),
                                            new Person("Ewa", "K.", 10),
                                            new Person("Anna", "Jankowska", 35));
    Collections.sort(personList);
    System.out.println(personList);
    Collections.sort(personList,(o1, o2) -> o1.getName().compareTo(o2.getName()));
    System.out.println(personList);
    Collections.sort(personList, Comparator.comparing(Person::getSurname).thenComparing(Person::getName));
        System.out.println(personList);

}

}
