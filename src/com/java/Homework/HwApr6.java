package com.java.Homework;

import java.util.Scanner;

public class HwApr6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int factorial = 1;
        for (int i = 1; i <= 5; i++){

            factorial = factorial * i;
            System.out.println(factorial);
        }

    }
}
