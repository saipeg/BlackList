package threads.shild.tick_tock;

public class TickTockRun {
    public static void main(String[] args) {
        TickTock tickTock = new TickTock();

        MyThread thread1 = new MyThread("Tick", tickTock);
        MyThread thread2 = new MyThread("Tock", tickTock);

//        try {
//            thread1.thrd.join();
//        } catch (InterruptedException exc) {
//            System.out.println("Stop main thread");
//        }
    }
}
