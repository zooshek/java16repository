package pl.jbaranska.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example {
    public static void main(String[] args) {
        Runnable job =() -> {
            System.out.println("Performed by: "+Thread.currentThread().getName());
        };
        Runnable job2 = ()->{

            for (int i = 0; i<10;i++)
            {
                System.out.println("Increment "+i);
            }
        };
        ExecutorService workers =  Executors.newFixedThreadPool(4);
        for(int i = 0; i<200; i++) {
            workers.execute(job);
            workers.execute(job2);
                }
        workers.shutdown();
       // workers.execute(job);

        System.out.println("after sending...");
        }

    }
