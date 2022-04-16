package com.java.class06;

import java.util.Scanner;

public class PositiveNegativeNumberCheck {
    public static void main(String [] args){

        System.out.println("lease enter number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num >0) {
            System.out.println("Positive");
        }else if (num <0) {
            System.out.println("Negative");
        }else{
            System.out.println("Zero");

        }
    }
}
