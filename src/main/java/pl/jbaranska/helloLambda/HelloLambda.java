package pl.jbaranska.helloLambda;

@FunctionalInterface
interface SeyHello{
    void seyHello();
    default void goodbye(){
        System.out.println("Goodbay");
    };
}

@FunctionalInterface
interface Test{

    public void doSomting(int a, String name);
    default void first (){
        System.out.println("Test1");
    }
    default void second (){
        System.out.println("Test2");
    }
}

public class HelloLambda{
    SeyHello seyHello;

    public static void main(String[] args) {
        SeyHello hello = () ->{};
        hello.seyHello();

        //zaczynamy od parametrow to co wiemy
        //test to jest przeslanie zachowania

        useTest((a,b) -> System.out.println(""+ b+b+" -- "+a+a)
                ,2,"a");

        useTest((a,b) -> System.out.println(""+b+b+b+"---"+a+a+a)
                ,5,"a");
        //klasa anonimowa --rozszerzenie testu nie wiadomo jak sie nazywa i tworze obiekt anonimowego typu.
        //Definicja klasy połaczona z powolaniem obiektu --
        //lambdy tylko do intefejsow ale w ten sposob mozemu implementowac klasy z motoda abstarkcyjna
        useTest(new Test() {
            @Override
            public void doSomting(int a, String name) {

            }
        }, 5, "a");
}
//co zrobimy z a i s a nie co zrobimy.

static void useTest(Test test, int a, String s)
{
    test.doSomting(a,s);
}
}
