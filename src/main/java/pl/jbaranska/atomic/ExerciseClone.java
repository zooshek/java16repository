package pl.jbaranska.atomic;

import java.awt.*;
class Person implements Cloneable{
    private String name;
    private String surname;

    private Person partner;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", partner=" + partner.name +
                '}';
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }

    public Person(String name, String surname, Person partner) {
        this.name = name;
        this.surname = surname;
        this.partner = partner;
    }

    public Person performCloning() {
        Person newYou = null;
        try {
            newYou =(Person)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return newYou;
    }
}

public class ExerciseClone {



    public static void main(String[] args) {
        Person me = new Person("Ja", "Moje nazwisko", null);
        Person partner = new Person("M", "K", me);
        me.setPartner(partner);

        System.out.println(me);
        System.out.println(partner);

        Person clonePartner = partner.performCloning();
        System.out.println(clonePartner);

    }
}
