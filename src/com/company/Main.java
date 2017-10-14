package com.company;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int userA = 0;
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char[] array = str.toCharArray();
        Arrays.sort(array);
        while (userA < 4) {
            System.out.println("Please select an option you would like to see.\n");
            System.out.println("1. Display character frequencies alphabetically");
            System.out.println("2. Display sorted frequencies");
            System.out.println("3. Show types of character frequencies");
            System.out.println("4. Exit");
            userA = s.nextInt();
            if (userA == 1) {
            // option 1
            }
            else if (userA == 2) {
                //option 2
            }
            else if (userA == 3) {
                for (char c : array) {
                    System.out.println(charType(c));//option 3
                }
            }
            else {
                return; //exit program
            }
        }
    }
    public static String charType(char cPrime) {
        String myResult;
        if (Character.isDigit(cPrime)) {
            myResult = cPrime + " is a number.";
            //System.out.println(cPrime + " is a number.");
        } else if (Character.isLetter(cPrime)) {
            myResult = cPrime + " is a letter.";
            //System.out.println(cPrime + " is a letter.");
        } else if (Character.isWhitespace(cPrime)) {
            myResult = cPrime + " is a whitespace.";
            //System.out.println(cPrime + " is a whitespace.");
        } else {
            myResult = cPrime + " is a symbol.";
            //System.out.println(cPrime + " is a symbol.");
        }
        return myResult;
    }
}