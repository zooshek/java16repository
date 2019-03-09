package pl.jbaranska.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {
    public static void main(String[] args) {
        AtomicInteger i = new AtomicInteger();
        Runnable job = ()-> {
            //zwieksz i wez ++i
            i.incrementAndGet();
            i.getAndIncrement(); //i++

            int currentValue = i.intValue();
            //
            do{

                currentValue= i.intValue();
            } while (!i.compareAndSet(currentValue, currentValue+2));
        };

        Thread t = new Thread(job);
        t.start();
    }
}
