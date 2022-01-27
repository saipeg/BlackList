package arrays;

public class VarArgs {

    public static void printSomeText(String... someText) {
        for (int i = 0; i < someText.length; i++) {
            System.out.println(someText[i]);
        }
    }

    public static void main(String[] args) {
        printSomeText("Hello", "Its Me", "From VarArgs");
    }

}
