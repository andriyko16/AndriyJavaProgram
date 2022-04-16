package com.java.Homework;

import java.util.Scanner;

public class WhlileLoopHw1 {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int count =1;
        int a =1;
        while (count<=10);{
            a=count*num;
            System.out.println(a);
            count++;
        }
    }
}
