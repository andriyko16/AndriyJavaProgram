package PracticeLinux;

import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        String str, rev = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word/number to find is a palindrome or not:");
        str = sc.nextLine();

        int length = str.length();

        for (int i = length - 1; i >= 0; i--)
            rev = rev + str.charAt(i);

        if (str.equals(rev))
            System.out.println(str + " is a palindrome");
        else
            System.out.println(str + " is not a palindrome");
    }

}



