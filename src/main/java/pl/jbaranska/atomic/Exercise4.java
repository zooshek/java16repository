package pl.jbaranska.atomic;

public class Exercise4 {
    public static void main(String[] args) {
        Person mariusz = new Person("Mariusz", "k", null);
        try {
            System.out.println("Before calling");
            synchronized (mariusz) {
                mariusz.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("After ...");
    }
}
