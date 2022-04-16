package com.java.class07;

import java.util.Scanner;

public class HwClass07 {
    public static void main(String [] args){
        System.out.println("Enter name of the product");
        Scanner sc = new Scanner(System.in);
        String product = sc.nextLine();

        switch (product) {
            case "Hangouts" :
            case "Outlook"  :
            case "Skype"  :
                System.out.println("Microsoft");
                break;
            case "Whatsapp" :
                System.out.println("Facebook");
                break;
            case "Gmail" :
            case "Youtube" :
                System.out.println("Google");
                break;
            default:
                System.out.println("Answer not found");
        }
    }

}
