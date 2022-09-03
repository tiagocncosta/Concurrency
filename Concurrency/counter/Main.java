package Concurrency.counter;

public class Main {

    public static void main(String[] args) throws InterruptedException {


        int how_many_threads = 100;
        Thread incrementingThread;
        Thread decrementingThread;

        final Counter counter = new Counter(); // se nao vou mudar mais mete final, é melhor pratica.


        incrementingThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < how_many_threads; i++) {
                    counter.add();
                    System.out.println("CounterA -> " + counter.getCounter());
                }
            }
        });

        decrementingThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < how_many_threads; i++) {
                    counter.subtract();
                    System.out.println("CounterB -> " + counter.getCounter());
                }
            }
        });

        incrementingThread.start();

        decrementingThread.start();


        //se nao imprimia antes de acabar de contar
        System.out.println(counter.getCounter());
    }
}

