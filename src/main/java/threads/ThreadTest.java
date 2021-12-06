package threads;

import java.util.concurrent.ExecutorService;

class SomeThread extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Num: " + i);
        }
    }
    ExecutorService executorService;
    public static void main(String[] args) {

        SomeThread someThread1 = new SomeThread();
        someThread1.start();

        SomeThread someThread2 = new SomeThread();
        someThread2.start();

    }

}