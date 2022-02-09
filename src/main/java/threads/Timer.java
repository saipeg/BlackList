package threads;

import java.time.LocalTime;

public class Timer implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(LocalTime.now());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.run();
    }
}
