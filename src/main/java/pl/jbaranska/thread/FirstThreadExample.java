package pl.jbaranska.thread;

public class FirstThreadExample {
    public static void main(String[] args) {
        Runnable job = ()-> {
            System.out.println("Worker: "+
            Thread.currentThread().getName());
            System.out.println("Run Forest");
        };

        job.run(); //main

        Thread worker = new Thread(job, "Pracuś");
        //przypisani nazwy bez pomocy konstruktora
        //  worker.setName("Worker");
        worker.run();
        worker.start();
        //worker.start();
        //java.lang.IllegalThreadStateException
        //at java.lang.Thread.start(Thread.java:708)
        //at pl.jbaranska.thread.FirstThreadExample.main(FirstThreadExample.java:18)

    }
}
