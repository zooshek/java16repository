package pl.jbaranska.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Thredpool {
    static private int i = 0;
    public static void main(String[] args) {
    Runnable job =() -> {
        synchronized (Thredpool.class) {
            i++;
        }
    };

    ExecutorService workers =  Executors.newFixedThreadPool(4);
    for (int j = 0; j<200000;j++) {
        workers.execute(job);
        }
    workers.shutdown();
    boolean done = false;
    do{
        try {

           done = workers.awaitTermination(1, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    } while (!done);

   while (!workers.isTerminated()) {
       try {

           workers.awaitTermination(1, TimeUnit.MILLISECONDS);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }

   }
        System.out.println("i = " + i);
    }
}
