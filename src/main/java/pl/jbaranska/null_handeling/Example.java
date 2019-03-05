package pl.jbaranska.null_handeling;

import java.util.Optional;

public class Example {
    public static void main(String[] args) {
        Computer fullOne = new Computer(new GraphicsCard(new Chipset("nVidia")));
        Computer withOutVendor = new Computer(new GraphicsCard(new Chipset(null)));
        Computer withOutChipset = new Computer(new GraphicsCard(null));
        Computer withOutGraphicsCard = new Computer(null);
        Computer meybeComputer = null;
        System.out.println(getVendorNameSuperNaiveImp(fullOne));
        System.out.println("..");
        System.out.println(getVendorNameSuperNaiveImp(meybeComputer));
        System.out.println("..");
        System.out.println(getVendorNameSuperNaiveImp2(meybeComputer));
        System.out.println("..");

        Optional<String> maybeMyName = Optional.ofNullable(null);
        if (maybeMyName.isPresent()) {
            maybeMyName.get();
        }

        maybeMyName.ifPresent(s -> System.out.println(s));
        maybeMyName.ifPresent(System.out::println);

    }

    public static String getVendorNameSuperNaiveImp(Computer computer) {
     return    Optional.ofNullable(computer)
                .flatMap(computer1 -> computer1.getGraphicsCard())
                .flatMap(graphicsCard -> graphicsCard.getChipset())
                .map(chipset -> chipset.getVendorName())
                .orElseGet(() -> "brak");

    }

    public static String getVendorNameSuperNaiveImp2(Computer computer) {
        return    Optional.ofNullable(computer)
                .flatMap(Computer::getGraphicsCard)
                .flatMap(GraphicsCard::getChipset)
                .map(Chipset::getVendorName)
                .orElseGet(() -> "brak");

    }
/*
    public static String getVendorNameSaveImp(Computer computer) {
        return "";
    }
    //cos co nulla lub niema
    //mapa zamienia jeden obiekt w drugi zamieniam computer w byc moze graficscard jesli w srodku nic nie ma przetwarzanie jest leniwe.
    //

    public static Optional<String> getVendorNameJava8WayShortWay(Computer computer) {
       return  Optional.ofNullable(computer)
                .map(Computer::getGraphicsCard)
                .map(GraphicsCard::getChipset)
                .map(Chipset::getVendorName);
             //   .orElseGet(()-> "Unknown");
      //  return Optional.empty();
    }

    public static Optional<String> getVendorNameJava8Way(Computer computer) {
        return  Optional.ofNullable(computer)
                .map(computer1 -> computer1.getGraphicsCard())
                .map(graphicsCard -> graphicsCard.getChipset())
                .map(chipset -> chipset.getVendorName());
        //   .orElseGet(()-> "Unknown");
        //  return Optional.empty();
    }
    */
}
