package Concurrency.factory;

public class Worker implements Runnable {
    private final int id;
    private final int numberOfPiecesToProduce;

    public Worker(int id, int numberOfPiecesToProduce) {
        this.id = id;
        this.numberOfPiecesToProduce = numberOfPiecesToProduce;
    }


    @Override
    public void run() {
        for (int i = 0; i < numberOfPiecesToProduce; i++) {
            System.out.println("worker with id " + id + " is producing");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
        System.out.println("worker with id " + id + " is ready for the day");
    }
}
