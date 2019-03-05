package pl.jbaranska.generics;

import pl.jbaranska.abstract_class.Cat;
import pl.jbaranska.abstract_class.Dog;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SecretExample {
    public static void main(String[] args) {
        MyStringSecret dream = new MyStringSecret("hahahaha");
        MyBigDecimalSecret incoms = new MyBigDecimalSecret(BigDecimal.ZERO);
        MySecretGenericV1 integer = new MySecretGenericV1(Integer.valueOf(1));

        MySecretGenericV1 anotherDream = new MySecretGenericV1("ahahahh");
        Integer secretInteger = (Integer) integer.getObject();

        checkMySecret(integer);
        checkMySecret(anotherDream);

        List animals = new ArrayList();
        animals.add(new Dog("Smyk"));
      //  animals.add(new Cat("Mruczek"));
        checkAnimal(animals);

        MySecondGeneric<String> stringMySecondGeneric = new MySecondGeneric<>("secret");
        MySecondGeneric<BigDecimal> bigDecimalMySecondGeneric = new MySecondGeneric<>(BigDecimal.ZERO);

        MySecondGeneric objecSecrer = new MySecondGeneric(new Object());
        MySecondGeneric<Object> objecSecrer2 = new MySecondGeneric<>(new Object());


      //  MyGenericSecrets<MyStringSecret, MyBigDecimalSecret> mySecrets = new MyGenericSecrets<>()\\;
    }
    public static void checkAnimal(List animals){
        for (Object animal: animals)
        { if (animal instanceof Dog) {
            System.out.println("Dog");
        }
        else if (animal instanceof Cat)
        {
            System.out.println("Cat");
        }
        else {
            System.out.println("Other");
        }
        }
    }
    public static void checkMySecret(MySecretGenericV1 secretGenericV1)
    {
        if(secretGenericV1.getObject() instanceof Integer) {
            Integer secret = (Integer) secretGenericV1.getObject();
            System.out.println("Secret" + secret);
        }
    }
}
