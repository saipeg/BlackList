package september;

public class Example {
    public static void main(String[] args) {
        int exp = 1;

        switch (exp) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("2");

            default:
                System.out.println("lol");

        }

        String s = "123";
        int x;
        String str;
        x = Integer.parseInt(s);
        System.out.println(x+1);
        str = String.valueOf(x + " some text");
        System.out.println(str);
    }

}
