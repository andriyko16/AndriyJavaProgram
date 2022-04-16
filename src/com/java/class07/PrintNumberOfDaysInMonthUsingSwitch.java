package com.java.class07;


import java.util.Scanner;

public class PrintNumberOfDaysInMonthUsingSwitch {

    public static void main(String [] args) {
        System.out.println("Please enter a month:");
        Scanner sc = new Scanner(System.in);
        String month = sc. nextLine();

        switch (month) {
            case "January":
                System.out.println("31 days - January");
                break;
            case "February":
                System.out.println("28/29 days -February");
                break;
            case "March":
                System.out.println("31 days - March");
                break;
            case "April":
                System.out.println("30 day - April");
                break;
            case "May":
                System.out.println("31 days - May");
                break;
            case "June":
                System.out.println("30 days - June");
                break;
            case "July":
                System.out.println("31 days- July");
                break;
            case "August":
                System.out.println("31 days - August");
                break;
            case "September":
                System.out.println("30 -days-September");
                break;
            case "October":
                System.out.println("31 days-October");
                break;
            case "November":
                System.out.println("30 days - November");
                break;
            case "December":
                System.out.println("31 -days December");}

    }
}
