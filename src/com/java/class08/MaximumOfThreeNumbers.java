package com.java.class08;

import java.util.Scanner;

public class MaximumOfThreeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter Three numbers to find out maximum value of them");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("Maximum #:" + a);
        } else if (b > a && b > c) {
            System.out.println("Maximum #:" + b);
        } else {
            System.out.println("Maximum #:" + c);
        }

    }


}
