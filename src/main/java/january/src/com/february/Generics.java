package com.february;

import java.util.stream.Stream;

public class Generics {

    public static void main(String[] args) {

    }

     <T> void printArray(T[] array) {
//        Stream.of(array).forEach(System.out::println);

         for (int i = 0; i < array.length; i++) {
             System.out.println(array[i]);
         }

    }

}
