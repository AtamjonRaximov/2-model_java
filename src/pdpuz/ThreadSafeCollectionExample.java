package pdpuz;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSafeCollectionExample  {
    private static final AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {

        Thread th1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.incrementAndGet();
            }
        });
        Thread th2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.incrementAndGet();
            }

        });

        th1.start();
        th2.start();
        th1.join();
        th2.join();

        System.out.println("natija :" + counter.get());
    }
}