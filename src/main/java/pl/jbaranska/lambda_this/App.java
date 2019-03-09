package pl.jbaranska.lambda_this;

public class App {
    private String name ="Main";
    public void move(){
        System.out.println("move() inside main");
    }

    public Moveable makeOne(){
        return new Moveable() {
          //  private String name = "Moveable";

            @Override
            public void move() {
                String name = "internal";
                System.out.println("inside anonymus class - move()");
              //  System.out.println("name = "+this.name);
                System.out.println(name );
                System.out.println("External class "+App.this.name);
                //this.move(); //rekurencja
            }
        };
    }


    public  Moveable makelambda()
    {
        //nie mozna zrobic pola klasy.
        String name = "ejroewj";
        //lambda faktory moze tylko utworzyc obiekt Moveable tylko raz nawet jak wywolasz
        // metode wielerazy a poprzez klase anonimowa za kazdym razem tworzy nowy obiekt
        return ()-> {
            //this odnosi sie do obiektu w ktorym sie znajdujemy czyli app a nie intefejcy Moveable
            //lepsza wydajność
            System.out.println(this.name);
            this.move();
        };
    }
    public String getName(){
        return name;
    }
    public static void main(String[] args) {
    }
}
