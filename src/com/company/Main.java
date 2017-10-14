package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char[] array = str.toCharArray();
        System.out.print("Content of Array: ");
        for(char c: array){
            System.out.print(c);
        }
    }
}
