package pl.jbaranska.abstract_class;

public class AnimalExample {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.handleAnimal(new Animal("Azor") {


            @Override
            public void eat() {
                System.out.println("eat");
            }

            @Override
            public void play() {
                System.out.println("play");
            }
        });

        zoo.handleAnimal(new Animal("Azor") {


            @Override
            public void eat() {
                System.out.println("eat");
            }

            @Override
            public void play() {
                System.out.println("play");
            }
        });
        //utworzony obiekt typu anomal
       Animal maybeCat;
       // tworzymy anonimowy obiekt i możemy wtedu wywolac metode miauu
        //w 10 var i java odzyska typ
       new Animal("cat") {
           @Override
           public void eat() {

           }
           @Override
           public void play() {

           }
           public void miauuu(){

           }
       }.miauuu();
    }
}
