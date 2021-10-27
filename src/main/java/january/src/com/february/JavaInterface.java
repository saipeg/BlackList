package com.february;

import java.util.*;

public class JavaInterface {

    public static int sum(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }

        int res = 0;

        for (Integer divisor : divisors) {
            res = res + divisor;
        }

        return res + n;
    }
}
