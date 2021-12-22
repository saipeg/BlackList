package someCodes;

public class ScopeCounter {

    public static void main(String[] args) {

        String[] text = {")", "(", "(", "("};

        int counter = 0;
        for (int i = 0; i < text.length; i++) {
            if(text[i] == "(") {
                counter++;
            } else {
                counter--;
            }
        }

        if (counter < 0) {
            System.out.println("( less than )");
        }
        if (counter > 0) {
            System.out.println(") less than (");
        } else {
            System.out.println("It's really good combination!");
        }

        System.out.println(counter);

    }
}
