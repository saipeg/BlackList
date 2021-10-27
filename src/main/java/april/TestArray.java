package april;

public class TestArray {

    public static void main(String[] args) {

        System.out.println("hello");

        char[] chars = {'1', '2', '3', '3', '3', '3', '3', '3', '\n', '\n', '\n', '\n', '3', '3','3'};
        if (getLength(chars) == 4 ) {
            System.out.println("Там что-то есть");
        } else {
            System.out.println("Хз че там");
        }
    }



    public static int getLength(char[] map) {

        int count = 0;
        for (char element : map) {
            if (element == '\n') {
                break;
            }
            count++;
        }
        System.out.println(count);
        return count;
    }


}


