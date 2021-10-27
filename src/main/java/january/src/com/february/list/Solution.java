package com.february.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        int elementsSize = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < elementsSize; i++) {
            list.add(scanner.nextInt());
        }

        int queriesSize = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < queriesSize; i++) {
            String queryCode = scanner.nextLine();
            processByQueryCode(queryCode, list);
        }
        System.out.println(list.toString().replace("[", "")
                .replace("]", "")
                .replace(",", ""));
    }

    private static void processByQueryCode(String queryCode, List<Integer> list) {
        if (queryCode.equals("Insert")) {
            String[] s = scanner.nextLine().split(" ");
            int index = Integer.parseInt(s[0]);
            if(index <= list.size() + 1) {
                int value = Integer.parseInt(s[1]);
                list.add(index, value);
            }
        }

        if (queryCode.equals("Delete")) {
            int indexForDelete = Integer.parseInt(scanner.nextLine());
            list.remove(indexForDelete);
        }
    }
}