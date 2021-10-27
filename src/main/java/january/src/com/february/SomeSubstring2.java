package com.february;

import java.util.Scanner;

public class SomeSubstring2 {

    //welcomtojava
    public static String getSmallestAndLargest(String s, int k) {
        if (k < 1){
            return "";
        }

        String loweredS = s;

        char[] chars = loweredS.toCharArray();

        char maxChar = chars[0];
        char minChar = chars[0];

        int maxCharIndex = 0;
        int minCharIndex = 0;

        for (int i = 0; i < loweredS.length(); i++) {
            if (chars[i] > maxChar) {
                maxCharIndex = loweredS.indexOf(chars[i]);
                int lastIndex = maxCharIndex + k - 1;

                if (lastIndex < loweredS.length()) {
                    maxChar = chars[i];
                    maxCharIndex = loweredS.indexOf(maxChar);
                }
            }
            if (minChar > chars[i]) {
                minCharIndex = loweredS.indexOf(minChar);
                int lastIndex = minCharIndex + k - 1;
                if (lastIndex <= loweredS.length()) {
                    minChar = chars[i];
                    minCharIndex = loweredS.indexOf(minChar);
                }
            }
        }

        if (minCharIndex + k > s.length() ){
            return "";
        }

        if (maxCharIndex + k > s.length() ){
            return "";
        }


        StringBuilder small = new StringBuilder("" + minChar);
        StringBuilder larg = new StringBuilder("" + maxChar);
        for (int i = 1; i < k; i++) {
            small.append(chars[minCharIndex + i]);
            larg.append(chars[maxCharIndex + i]);
        }
        String smallest = small.toString();
        String largest = larg.toString();


        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
