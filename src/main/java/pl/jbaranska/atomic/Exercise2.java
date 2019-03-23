package pl.jbaranska.atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Exercise2 {
    //3 watki zwiekszaja zmienna long
    //watki uzywaja synchrinizacji rzy zapisie
    //jeden watek wypisuje bez synchronizacji


    //volatile zapewnia ze odczyt zawsze bedzie aktualny dla zapisu wystarczy synchronizacja
    //volatile static long number = 0;
    static long number = 0;
    public static void main(String[] args) {

        Runnable job = () ->{

          for(int i = 0; i<500; i++)
          {
              try {
                  Thread.sleep(10);
                  synchronized (Exercise2.class)
                  {
                      number++;
                  }
                  System.out.println(Thread.currentThread().getName()+" "+number);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }

        };

        Runnable job_display = () -> {
            int k = 0;
                while(true) {

                    System.out.println("Number = " + number);

                }
        };


        ExecutorService workers = Executors.newFixedThreadPool(4);
        workers.execute(job);
        workers.execute(job);
        workers.execute(job);

        workers.execute(job_display);

        workers.shutdown();

        try {
            workers.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
