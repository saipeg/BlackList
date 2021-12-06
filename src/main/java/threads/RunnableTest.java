package threads;

class InterfaceRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Num: " + i);
        }
    }

    public static void main(String[] args) {

        Thread thread1 = new Thread(new InterfaceRunnable());
        Thread thread2 = new Thread(() -> System.out.println("thread with lambda"));

        Thread anonymous = new Thread(new Runnable() { //анонимный класс
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Num: " + i);
                }
            }
        });

        Thread thread4 = new Thread(
                () -> {
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Num: " + i);
                    }
                }
        );

        Thread thread5 = new Thread(
                () -> {
                    System.out.println("Hello from thread5");
                }
        );

        thread1.start();
        thread2.start();
        anonymous.start();
        thread4.start();
        thread5.start();

    }
}
