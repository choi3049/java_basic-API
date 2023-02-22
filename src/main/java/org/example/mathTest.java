package org.example;

import java.util.Random;

public class mathTest {
    public static void ma() {
        System.out.println(Math.ceil(10.0));      // 10.0
        System.out.println(Math.ceil(10.1));      // 11.0
        System.out.println(Math.ceil(10.000001)); // 11.0

        System.out.println(Math.floor(10.0));     // 10.0
        System.out.println(Math.floor(10.9));     // 10.0

        System.out.println(Math.round(10.0));     // 10
        System.out.println(Math.round(10.4));     // 10
        System.out.println(Math.round(10.5));     // 11
    }

    public static void ra() {
        System.out.println((int) (Math.random() * 100)); // 0 ~ 99
        Random ran = new Random();
        System.out.println(ran.nextInt(100));           // 0 ~ 99
    }

    public static void ab(){
        System.out.println(Math.abs(10));    // 10
        System.out.println(Math.abs(-10));   // 10
        System.out.println(Math.abs(-3.14)); // 3.14
    }

    public static void po() {
        System.out.println((int)Math.pow(5, 2)); // 25
        System.out.println((int)Math.sqrt(25));  // 5
    }
}
