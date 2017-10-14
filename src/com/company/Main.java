package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char[] array = str.toCharArray();
        for(char c: array){
            if (Character.isDigit(c)){
                System.out.println(c + " is a number.");
            }
            else if(Character.isLetter(c)){
                System.out.println(c + " is a letter.");
            }
            else{
                System.out.println(c + " is a symbol.");
            }
            }
    }
}
