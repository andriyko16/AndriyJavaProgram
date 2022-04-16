package com.java.class07;

import java.util.Scanner;

public class HW02Class07 {
    public static void main(String [] args) {
        System.out.println("please enter a letter");
        Scanner sc = new Scanner(System.in);

        String character = sc.nextLine();

        switch(character) {
            case "a" :
            case "e" :
            case "i" :
            case "o" :
            case "u" :
                System.out.println("This character is a vowel");
                break;
            default:
                System.out.println("This character is not a vowel");
        }

    }
}
