package threads.training;

public class ThreadFromExtThread extends Thread {

    public void run() {
        System.out.println("Hello from RUUUN!N!!!!!");
    }

    public static void main(String[] args) {
        ThreadFromExtThread threadFromExtThread = new ThreadFromExtThread();
        threadFromExtThread.start();
    }

}
