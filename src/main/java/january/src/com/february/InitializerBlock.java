package com.february;

import java.util.Scanner;

public class InitializerBlock {

    static boolean flag;
    static int B, H;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        flag = B >= 0 && H >= 0;
        if (!flag) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
//                              java.lang.Exception: Breadth and height must be positive
            System.exit(0);
        }
    }



}
