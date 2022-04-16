package PracticeDay;

//  Take two words from the user and concatenate two words together
//however if the concatenation creates a  double char, then omit one of the characters. Save the result of concatenation and print it out.
//   * ex:
//     * "abc" "cat" -> "abcat"
//    *
//    * ex2:
//    * abc", "xyz" -> "abcxyz"
//    *
//     * ex3:
//     * "happy", "yolk" -> happyolk
//  *

import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first word");
        String word1= sc.nextLine();
        System.out.println("Please enter second word");
        String word2 = sc.nextLine();


        System.out.println(word1+word2);
        String word3=word1.concat(word2);

        System.out.println("The concatenated string:"+ word3);

    }
}
