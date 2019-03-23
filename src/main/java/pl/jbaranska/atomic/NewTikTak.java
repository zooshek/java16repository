package pl.jbaranska.atomic;

import java.lang.management.ThreadInfo;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewTikTak {
    static public  String currentState = "Tak";

    public static String changeState (String state)
    {
        String newState ="";
        if (state=="Tak")
        {return "Tik";}
        else
        return "Tak";
    }


    public static void main(String[] args) {

        Runnable job = () ->{
            try {
                Thread.sleep(200);


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (Thread.currentThread())
            {
            System.out.println( NewTikTak.changeState(currentState));}

            try {
                Thread.currentThread().notify();
                Thread.currentThread().wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        };
       for (int i = 0;i<1000;i++) {
           ExecutorService workers = Executors.newFixedThreadPool(2);

            workers.execute(job);
           workers.execute(job);
           workers.shutdown();
       }
    }
}
