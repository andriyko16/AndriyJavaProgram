package com.java.class06;

import java.util.Scanner;

public class NumberOfDaysInMonth {

    public static void main(String [] args){
        System.out.println("Enter month");

        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        if(month == 1) {
            System.out.println("January -31 days");
        }else if (month == 2) {
            System.out.println("February 28-29days");
        }else if (month ==3 ) {
            System.out.println("March-31days");
        }else if (month == 4) {
            System.out.println("April- 30days");
        }else if (month == 5) {
            System.out.println("May- 31days");
        }else if (month == 6) {
            System.out.println("June - 30days");
        }else if (month == 7) {
            System.out.println("July- 31days");
        }else if (month == 8) {
            System.out.println("August- 31days");
        }else if (month == 9) {
            System.out.println("September- 30days");
        }else if (month == 10) {
            System.out.println("October- 31days");
        }else if (month == 11) {
            System.out.println("November- 30days");
        }else if (month == 12) {
            System.out.println("December- 31days");

            System.out.println("invalid number");
            System.out.println("please enter a # from 1 - 12");
        }
    }
}