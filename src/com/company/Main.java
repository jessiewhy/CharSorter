package com.company;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char[] array = str.toCharArray();
        for(char c: array) {
            if (charType(c) == 'i') {
            System.out.println("Character type is a number.");
        }
           else if(charType(c) == 'l'){
                System.out.println("Character type is a letter.");
            }
            else if (charType(c) == 'w') {
                System.out.println("Character type is a whitespace.");
            }
            else {
                System.out.println("Character type is a symbol.");
            }
        }
    }
    public static char charType(char cPrime) {
        char myType;
        if (Character.isDigit(cPrime)) {
            myType = 'i';
            //System.out.println(cPrime + " is a number.");
        } else if (Character.isLetter(cPrime)) {
            myType = 'l';
            //System.out.println(cPrime + " is a letter.");
        } else if (Character.isWhitespace(cPrime)) {
            myType = 'w';
            //System.out.println(cPrime + " is a whitespace.");
        } else {
            myType = 's';
            //System.out.println(cPrime + " is a symbol.");
        }
        return myType;
    }
}