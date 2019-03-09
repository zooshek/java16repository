package pl.jbaranska.thread.secondExample;

public class SecondThreadExample {
    public static void main(String[] args) {
        System.out.println("Start");
        Runnable job = ()->{
            for (int i = 0 ; i<10;i++) {
                System.out.println("I'm working..."+ i +" "+Thread.currentThread().getName());
            }
        };
        Thread worker = new Thread(job, "Janusz");
        worker.setDaemon(true);
        Thread worker1 = new Thread(job, "Stefan");
        worker1.setDaemon(true);
        System.out.println("Main pierszy");
        worker.start();
        System.out.println("Main drugi");
        worker1.start();
        System.out.println("Main trzeci");
        System.out.println("End");


    }
}
