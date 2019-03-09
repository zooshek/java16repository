package pl.jbaranska.thread.third;

public class Main {
    public static void main(String[] args) {

        Runnable display10xjob = () -> {
            for(int i = 0;i<10;i++) {
                System.out.println(Thread.currentThread().getName()+ " Mój tekst"+ i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable tik = ()-> {
            for(int i = 0;i<10;i++) {
                System.out.println("tik");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable tak = ()-> {
            for(int i = 0;i<10;i++) {
                System.out.println("tak");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable deamon_job = ()->{
            for(int i = 0; i<3;i++) {
                String deamonName = Thread.currentThread().getName()+ " - deamon"+i;
                Thread worker3 = new Thread(display10xjob, deamonName);
                worker3.setDaemon(true);
                worker3.start();
                System.out.println(deamonName);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
      //  Thread thread = new Thread(tik).start();

        Thread w1 = new Thread(tik);
        w1.start();
        Thread w2 = new Thread(tak);
        w2.start();
        /*
        Thread worker1 = new Thread(deamon_job, " Thread Pierwszy");
        worker1.setPriority(Thread.NORM_PRIORITY);
        worker1.start();

        Thread worker2 = new Thread(deamon_job, "Thread Drugi");
        worker2.setPriority(Thread.MIN_PRIORITY);
        worker2.start();
        */

    }
}
