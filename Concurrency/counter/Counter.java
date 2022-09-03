package Concurrency.counter;

public class Counter {
    private int counter = 0;

    public synchronized void add() {
        synchronized (this) {
            counter++;
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void subtract() {
        counter--;
    }

    public int getCounter() {
        return counter;
    }

}
