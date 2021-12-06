package sunLessons.lesson1;

public class MainApp {
    public static void main(String[] args) {
        Runnable r1 = () -> {
            System.out.println(1);
        };

        Runnable r2 = () -> {
            System.out.println(2);
        };

        new Thread(r1).start();
        new Thread(r2).start();



    }
}
