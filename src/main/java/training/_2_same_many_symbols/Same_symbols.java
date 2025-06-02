package training._2_same_many_symbols;

public class Same_symbols {
    public static void main(String[] args) {
        char[] scopes1 = {'(', ')', ')', ')', '('};
        char[] scopes2 = {'(', ')', '(', ')'};

        System.out.println(isBalance(scopes1));
        System.out.println(isBalance(scopes2));

    }

    static boolean isBalance(char[] scopes) {
        int balance = 0;

        for (char scope : scopes) {
            if (scope == '(') {
                balance++;
            } else {
                balance--;
            }

        }

        return balance == 0;
    }
}
