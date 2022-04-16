package com.java.Homework;

import java.util.Scanner;

public class Whileloop2 {

    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner sc=new Scanner(System.in);

        int num= sc.nextInt();
        int a=1;
        while(a<=num){
            if (a%3==0 && a%5==0) {
                System.out.println(a);
            }
        a++;
        }
    }
}
