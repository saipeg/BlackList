package com.february;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList_Hack1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<List<Integer>> inputLines = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> gorizontList = new ArrayList<>();
            String[] s = scanner.nextLine().split(" ");
            for (String value : s) {
                gorizontList.add(Integer.parseInt(value));
            }
            inputLines.add(gorizontList);
        }

        int q = scanner.nextInt();
        scanner.nextLine();

        List<List<Integer>> coordinats = new ArrayList<>();
        for (int i = 0; i < q; i++) {

            List<Integer> x_y_Line = new ArrayList<>();
            String[] line = scanner.nextLine().split(" ");
            for (String value : line) {
                x_y_Line.add(Integer.parseInt(value));
            }
            coordinats.add(x_y_Line);
        }

        for (int i = 0; i < q; i++) {

            try {
                List<Integer> integers = coordinats.get(i);
                Integer x = integers.get(0);
                Integer y = integers.get(1);

                List<Integer> finishLine = inputLines.get(x - 1);
                Integer finishElement = finishLine.get(y);

                System.out.println(finishElement);
            } catch (Exception Exeption) {
                System.out.println("ERROR!");

            }
        }

    }
}