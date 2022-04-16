package com.java.class15;


import java.util.Scanner;

public class PrintInitials {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your Full Name");
        String fullName = sc.nextLine();
        String[] splitName = fullName.split(" ");
        String newStr = "";
        for(String s:splitName){
           newStr += s.charAt(0) + " . ";
        }
        System.out.println(newStr);
    }
}
