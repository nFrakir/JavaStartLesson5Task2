package com.gmail.seliverstova.hanna;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int length;
        int tempElement = 0;
        int [] array;

        System.out.println("Input array length and press Enter");
        length = sc.nextInt();
        array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*10);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length / 2; i++) {
            tempElement = array[i];
            array[i] = array[length-i-1];
            array[length-i-1] = tempElement;
        }

        System.out.println(Arrays.toString(array));
        sc.close();
    }
}
