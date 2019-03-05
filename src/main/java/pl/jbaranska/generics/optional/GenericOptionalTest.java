package pl.jbaranska.generics.optional;

import java.util.Optional;
import java.util.function.Predicate;

public class GenericOptionalTest {
    public static void main(String[] args) {
        Optional<String> maybeName = Optional.of("Joanna");
       // Optional<String> maybeName = Optional.ofNullable(null);

       boolean b =  checkIfNameMatch("Joanna", maybeName);
        System.out.println(b);


         b =  checkIfNameMatch("", maybeName);
        System.out.println(b);
    }

    public static boolean checkIfNameMatch (String name, Optional<String> maybeName)
    {
        Predicate<String> stringTest = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return name.equals(s);
            }
        };

        Predicate<CharSequence> charSequencePredicate = new Predicate<CharSequence>() {
            @Override
            public boolean test(CharSequence charSequence) {
                return name.equals(charSequence);
            }
        };
        System.out.println("Testing..");
        System.out.println(
        maybeName.filter(t -> stringTest.test(t)));

        System.out.println(maybeName.filter(s-> charSequencePredicate.test(s)));
        System.out.println(maybeName.filter(charSequencePredicate::test));
        System.out.println("1st test "+ maybeName.filter(stringTest));
        System.out.println(maybeName.filter(stringTest::test));
        System.out.println("2 nd test"+ maybeName.filter(charSequencePredicate));

        return maybeName.filter(t -> t.equals(name)).isPresent();

    }
}
