package threads.synchronizedExample;

import java.util.Collection;
import java.util.HashSet;

public class SynchronizedWithLock {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        Runnable task = () -> {
            synchronized (lock) {
                System.out.println("thread");
            }
        };

        Thread th1 = new Thread(task);
        th1.start();
        synchronized (lock) {
            for (int i = 0; i < 8; i++) {
                Thread.currentThread().sleep(1000);
                System.out.println(" " + i);
            }
            System.out.println(" ...");
        }

        Collection<?> collection = new HashSet<>();
        Object object = new Object();

        collection.remove(object);


    }
}
