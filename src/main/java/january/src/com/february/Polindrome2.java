package com.february;


import java.util.*;

public class Polindrome2 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String someWord = sc.next();

        char[] chars = someWord.toCharArray();
        char[] reChars = new char[someWord.length()];


        int someWordLength = someWord.length();
        int count = 0;

        for (int i = someWordLength - 1; i >= 0; i--) {

            reChars[count] = chars[i];
            count++;
        }

        System.out.println(reChars);
        System.out.println(reChars.toString());
        System.out.println(Arrays.toString(reChars));



        if(someWord.equalsIgnoreCase(String.valueOf(reChars))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        /* Enter your code here. Print output to STDOUT. */

    }


}
