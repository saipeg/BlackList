package threads.gum_thread;

public class Ex1 {
    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> System.out.println("Privet"));
        thread1.start();

        System.out.println("Poka");

    }
}
