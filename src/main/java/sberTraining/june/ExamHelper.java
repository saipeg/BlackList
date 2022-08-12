package sberTraining.june;

public class ExamHelper {
    public static void main(String[] args) {
        System.out.println(m(2));
        test();
    }

    public static void test() {
        int x = 1;
        int y = 2;

        if (x!=1)
            if(y==2) {
                System.out.println("x=2");
            };
    }

    private static int m(int num) {
        return num;
    }

}
