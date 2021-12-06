package threads.different.methods;

public class synchronizedExample {
    public static void main(String[] args) throws InterruptedException {

        Object lock = new Object();

        Runnable task = () -> {
            System.out.println("thread");
        };

        Thread th1 = new Thread(task);
        th1.start();
        synchronized(lock) {
            for (int i = 0; i < 8; i++) {
                Thread.currentThread().sleep(1000);
                System.out.println(" " + i);
            }
            System.out.println("...");
        }
    }
}
