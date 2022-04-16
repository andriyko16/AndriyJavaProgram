package com.java;


import kotlin.ReplaceWith;

import java.util.Locale;

public class StringMethod {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "hello World";
        String str3 = "Hello World! Welcome to DevX";
        // 1. We want to check equality of two Strings

        System.out.println("1. Equality :"+str1.equals(str2));

        System.out.println("==============================");

        // 2. We want to check equality of two Strings ignoring case

        System.out.println("2. Equality ignoring case:"+str1.equalsIgnoreCase(str2));


        System.out.println("==============================");

        //3. Check one String contains another String
        //Contains will check one string contains another string considering case-sensitive
        System.out.println("3. Contains"+str3.contains(str1));

        //If want to check one string contains another String ignoring case then we have to change
        //Both String in same case and then check contains, so it'll check only content of both Strings
        String str3LowerCase = str3. toLowerCase();
        String str2LowerCase = str2.toLowerCase();


        System.out.println("3.1 Contains "+ str3LowerCase.contains(str2LowerCase));

        System.out.println("==============================");


        //4. Changing the case of String

        System.out.println("4. Upper Case :" +str3.toUpperCase());
        System.out.println("4. Lower Case :" +str3.toLowerCase());

        System.out.println("==============================");

        //5.Find index of charter // number of letter// on Index count start from 0 to ...
        System.out.println("6. Index of Char" +str3.indexOf('W'));
        System.out.println("5. Last Index of char" + str3.lastIndexOf('W'));


        System.out.println("==============================");

        // 6.Find index of charter


        System.out.println("6. Last Index of Char:" +str3.lastIndexOf('W'));

        System.out.println("==============================");

        //7. Length of the String
        System.out.println("7. Length of String"+str1.length());
        System.out.println("7. Length of String"+str3.length());

        System.out.println("==============================");

        //8. Empty and Blank
        str1 = "          ";
        str3 = "a";

        System.out.println("8.Empty:" +str1.isEmpty());
        System.out.println("8. Empty"+str3.isEmpty());
        System.out.println("8. Blank" + str1.isBlank());
        System.out.println("8. Blank" + str3.isBlank());

        //9. Replace and ReplaceAll
        str1 = "INR 200";
        str3 = "Devx";

        System.out.println("9. Replace:" + str1.replace("INR","USD"));

        System.out.println("==============================");

        //10. Format

        str1 = "Welcome %s, Hello to %s";
        System.out.println("10.Format:" + String.format(str1, "Andriy","Ebay"));

        System.out.println("=============================");

        //11.Substring

        str1 = "Welcome to java class. Today is fun day";
        System.out.println("11.Substring:" + str1.substring(0));
        System.out.println("11 Substring:"+ str1.substring(0,7));
        System.out.println("==============================");

        //12.Split


        str1 = "Learning Java Daily";
        String[] words = str1.split(" ");

        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);

        System.out.println("==============================");
    }
}
