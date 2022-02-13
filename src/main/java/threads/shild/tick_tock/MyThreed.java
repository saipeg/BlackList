package threads.shild.tick_tock;

public class MyThreed implements Runnable {

    Thread thrd;
    TickTock ttOb;

    MyThreed(String name, TickTock tt) {
        thrd = new Thread(this, name);
        ttOb = tt;
    }

    public static MyThreed createAndStart(String name, TickTock tt) {
        MyThreed myThreed = new MyThreed(name, tt);
        myThreed.thrd.start();
        return myThreed;
    }

    public void run() {
        if (thrd.getName().compareTo("Tick") == 0) {
            for (int i = 0; i < 5; i++) ttOb.tick(true);
            ttOb.tick(false);

        } else {
            for (int i = 0; i < 5; i++) ttOb.tock(true);
            ttOb.tock(false);

        }
    }
}
