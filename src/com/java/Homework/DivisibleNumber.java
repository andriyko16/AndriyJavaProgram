package com.java.Homework;

import java.util.Scanner;

public class DivisibleNumber {
    //Write a java program to check given number is divided by 5 or not
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num % 5 == 0) {
            System.out.println("The number is divisible by 5");
        }else{
            System.out.println("The number is not divisible by 5");
        }
    }
}
