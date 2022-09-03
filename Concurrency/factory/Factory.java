package Concurrency.factory;

public class Factory {
    public static void main(String[] args) {
        Thread worker1 = new Thread(new Worker(1, 10));
        Thread worker2 = new Thread(new Worker(2, 6));

        worker1.start();
        worker2.start();
        try {
            worker1.join();
            worker2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("The job for the day is done !");
    }
}
