package com.java.Homework;

import java.util.Scanner;

public class GradeHW {
    public static void main(String[] args) {
        System.out.println("Write your score number to check the grade");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if(score>90){
            System.out.println("Grade is A!");
        }else if (score <89 && score >80) {
            System.out.println("Grade is B!");
        }else if(score <79 && score >70){
            System.out.println("Grade is C!");
        }else if(score <69 && score > 60) {
            System.out.println("Grade is D!");
        }else if(score<59 && score >50) {
            System.out.println("Grade is E");
        }else if (score <49){
            System.out.println("Fail");
        }
    }
}
