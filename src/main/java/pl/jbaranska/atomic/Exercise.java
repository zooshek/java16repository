package pl.jbaranska.atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Exercise {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);

        Runnable job = () -> {
            int wait =0;
          for(int i = 0; i< 100;i++)
          {
              int number= atomicInteger.incrementAndGet();
              if (atomicInteger.compareAndSet(number, number+1))
              {
                  wait++;
              }

              System.out.println(Thread.currentThread().getName() +" "+number );
            //jesli petna wykona sie wiecej niz raz trzeba cos zmierzyc
          }
            System.out.println(wait);
        };

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.execute(job);
        executorService.execute(job);
        executorService.execute(job);
        executorService.execute(job);
        executorService.shutdown();


        boolean done = false;
        do {
            try {
                done = executorService.awaitTermination(1, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }while (!done);

    }
}
