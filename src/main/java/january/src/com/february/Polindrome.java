package com.february;


import java.io.*;
import java.util.*;

public class Polindrome {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        StringBuffer rev = new StringBuffer(A).reverse();

        String strRev = rev.toString();

        if(A.equalsIgnoreCase(strRev)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        /* Enter your code here. Print output to STDOUT. */

    }


}
