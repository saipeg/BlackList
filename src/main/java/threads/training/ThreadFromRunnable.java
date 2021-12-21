package threads.training;

public class ThreadFromRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hi from Runnable");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadFromRunnable());
        thread.start();
    }

}
