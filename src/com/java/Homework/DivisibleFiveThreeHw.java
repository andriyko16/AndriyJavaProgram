package com.java.Homework;

import java.util.Scanner;

public class DivisibleFiveThreeHw {
    public static void main(String[] args) {
        System.out.println("Please Enter any number to know if it is divisible by 5 or 3:");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Divisible by 5 & 3");
        } else if (num % 3 == 0) {
            System.out.println("Divisible 3");
        }else if (num % 5 == 0) {
            System.out.println("Divisible by 5");
        }else {
            System.out.println("Number is not divisible");
        }
    }
}
