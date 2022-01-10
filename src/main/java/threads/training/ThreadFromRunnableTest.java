package threads.training;

public class ThreadFromRunnableTest implements Runnable {
    @Override
    public void run() {
        System.out.println("Hi from runnable interface(impl) ");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadFromExtThread());
    }
}
