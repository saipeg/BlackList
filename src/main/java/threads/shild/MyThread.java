package threads.shild;

public class MyThread implements Runnable {
    String thrdName;


    public MyThread(String thrdName) {
        this.thrdName = thrdName;
    }


    @Override
    public void run() {
        System.out.println(thrdName + " - запуск");

        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("B " + thrdName + ", счетчик: " + count);
            }
        }
        catch (InterruptedException exc) {
            System.out.println(thrdName + " - прерван");
        }
        System.out.println(thrdName + " - завершение");
    }
}

class UseThreads {
    public static void main(String[] args) {
        System.out.println("Start main thread #1");

        MyThread myThread = new MyThread("Вложенный поток #2");
        Thread newThread = new Thread(myThread);
        newThread.start();

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException exc) {
                System.out.println("Прерывание основного потока");
            }
        }
        System.out.println("Завершение основного потока");
    }
}

