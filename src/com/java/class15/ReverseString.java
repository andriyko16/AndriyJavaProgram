package com.java.class15;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name");
        String str =sc.nextLine();
        String strRev = "";
        for(int i = str.length()-1; i >=0; i--) {
            strRev+=str.charAt(i);
        }
        System.out.println(strRev);
    }
}


