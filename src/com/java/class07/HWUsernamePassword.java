package com.java.class07;

import java.util.Scanner;

public class HWUsernamePassword {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Username! ");
        String username = sc.nextLine();
        System.out.println("Enter your Password");
        String password = sc. nextLine();

        if (username.equals("School") && password.equals("123")) {
            System.out.println("Login successful");
        }else if (! username. equals("Schools") && !password.equals("123")) {
            System.out.println("Login unsuccessful");
        }else if (!username.equals("School")) {
            System.out.println("Invalid username");
        }else {
            System.out.println("invalid password");
        }
    }
}
