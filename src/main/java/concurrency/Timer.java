package concurrency;

import java.sql.Time;
import java.time.LocalTime;

public class Timer implements Runnable {
    @Override
    public void run() {
        System.out.println(LocalTime.now());
    }

    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.run();
    }
}
