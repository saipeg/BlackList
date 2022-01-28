package strings;

public class StringReplacer {
    public static void main(String[] args) {
        String s2 = "poka";
        String s3 = s2.replace('k', 'k');
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println(s2 == s3);
        System.out.println("=================");

        String s4 = "poka";
        String s5 = s4.replace("k", "k");
        System.out.println("s4 = " + s4);
        System.out.println("s5 = " + s5);
        System.out.println(s4 == s5);
    }
}
