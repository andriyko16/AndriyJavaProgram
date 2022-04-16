package com.java.Homework;

import java.util.Scanner;

public class SizeMeasurementHW {
    public static void main(String[] args) {
        System.out.println("Please Enter T-shirt size in inches");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >= 27 && num <= 30){
            System.out.println("Your size is XS");
        }else if (num >=31 && num <=34 ) {
            System.out.println("Your size is S");
        } else if (num >= 35 && num <=38) {
            System.out.println("Your size is L");
        }else if (num >= 39 && num <= 42) {
            System.out.println("Your size is XL");
        }else if (num >= 45 && num <= 50){
            System.out.println("Your size is XXL");
        }else {
            System.out.println("Invalid Entry. Re-enter your size correctly");
        }
    }
}
