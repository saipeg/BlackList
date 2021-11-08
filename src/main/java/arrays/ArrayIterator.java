package arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArrayIterator {

    public static void main(String[] args) {

        final String[] languages = {
                "C++",
                "Java",
                "JavaScript",
                "Go",
                "Cobol",
                "Perl"
        };

        for (String language : languages) {
            System.out.println(language);
        }

        System.out.println("===================================");

        System.out.println(Arrays.toString(languages));

    }


}
