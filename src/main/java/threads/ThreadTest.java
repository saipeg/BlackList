package threads;


class SomeThread extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Num: " + i);
        }
    }

    public static void main(String[] args) {

        SomeThread someThread1 = new SomeThread();
        someThread1.start();

        SomeThread someThread2 = new SomeThread();
        someThread2.start();

    }

}