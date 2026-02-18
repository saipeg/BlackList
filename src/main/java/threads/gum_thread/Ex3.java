package threads.gum_thread;

public class Ex3 {

}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("some work");
    }
}