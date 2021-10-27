package com.february.Map;

//Complete this code or write your own from scratch

import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] argh) {
        Map<String, Integer> map = new HashMap<String, Integer>(); //отображение
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            map.put(name, phone);
        }

        List<String> list = new ArrayList<>();

        while(in.hasNext()) {
            String s = in.nextLine();
            list.add(s);
        }

        for (String name : list) {
            if (map.containsKey(name)) {
                System.out.println(name + "=" + map.get(name));
            } else {
                System.out.println("Not found");
            }
        }

    }
}
