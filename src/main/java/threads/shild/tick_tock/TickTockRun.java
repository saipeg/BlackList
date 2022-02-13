package threads.shild.tick_tock;

public class TickTockRun {
    public static void main(String[] args) {
        TickTock tickTock = new TickTock();
        System.out.println("Создался поток ");

        MyThreed thread1 = new MyThreed("Tick", tickTock);
        MyThreed thread2 = new MyThreed("Tock", tickTock);

        try {
            thread1.thrd.join();
            thread2.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Stop main thread");
        }
    }
}
