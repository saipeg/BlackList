package string_trainer;

public class StrOps {
    public static void main(String[] args) {
        String text = "Hello from Spb, my friend!";

        System.out.println("text.length() = " + text.length());
        System.out.println("text.indexOf(\"my\") = " + text.indexOf("my"));
        System.out.println("text.lastIndexOf(\"Hello\") = " + text.lastIndexOf("friend!"));

        System.out.println("How match longer this text? " +
                "How match longer this text?".length());
        System.out.println("==============================================");

        char[] someText = {'(', '(', '(', ')', ')'};

        String s = String.valueOf(someText);
        System.out.println(s);
        //TODO calculate and result

    }
}
