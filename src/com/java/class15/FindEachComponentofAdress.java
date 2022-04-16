package com.java.class15;

public class FindEachComponentofAdress {
    public static void main(String[] args) {
        String address = "B604,Cosmos Society, Margar City, Pune, 600045, =)";

        String words[] = address.split( ",");

        System.out.println(words[0].trim());
        System.out.println(words[1].trim());
        System.out.println(words[2].trim());
        System.out.println(words[3].trim());
        System.out.println(words[4].trim());
        System.out.println(words[5].trim());
    }
}
