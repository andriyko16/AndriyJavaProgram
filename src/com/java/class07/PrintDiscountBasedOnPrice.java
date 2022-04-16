package com.java.class07;

import java.util.Scanner;

public class PrintDiscountBasedOnPrice {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Price based on Discount");
        int price = sc. nextInt();

        if(price <100 ) {
            System.out.println("No discount");
        }else if (price < 500) {
            System.out.println("5% discount");
        }else if (price < 1000) {
            System.out.println("10% discount");
        }else if (price >= 1000) {
            System.out.println("15% discount");
        }
    }
}
