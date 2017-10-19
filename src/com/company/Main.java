package com.company;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    //final int ASCII_SIZE = 256;
    public static void main(String[] args) {
        int userA = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Please input a string.\n");
        String str = s.nextLine();
        char[] array = str.toCharArray();
        int[] frq_array = new int[256];

        //Arrays.sort(array);
        while (userA < 4) {
            System.out.println("Please select an option you would like to see.\n");
            System.out.println("1. Display character frequencies alphabetically");
            System.out.println("2. Display sorted frequencies");
            System.out.println("3. Show types of character frequencies");
            System.out.println("4. Exit");
            userA = s.nextInt();
            if (userA == 1) {
                // System.out.println(strSort(array));
                // char[] srtArray = strSort(array);
                frq_array = alphabeticalSort(str);
                for ( int i = 0; i < frq_array.length; i++ )
                {
                    if ( frq_array [i] > 0 )
                    {
                        System.out.println( (char)i + " freq: " + frq_array[i] );
                    }
                }

            }

            else if (userA == 2) {
                frq_array = alphabeticalSort(str);
                int maxFreq = 32256;
                int[][] frqsrt_array = new int[256][maxFreq];

                frqsrt_array = dimSort(frq_array);
                int maxf = maxFreq(frq_array);
                for (int j=maxf; j >=0;j--){
                    for(int i=0; i< frq_array.length; i++ ) {
                        if (frqsrt_array[i][j] != 0 )
                            System.out.println((char)i+" freq: "+j);
                    }
                }


            }
            else if (userA == 3) {
                int txtCnt=0, numCnt=0,wspCnt=0,symbCnt=0;

                for (char c : array) {
                    if (Character.isDigit(c)) {
                        numCnt++;
                        //System.out.println(cPrime + " is a number.");
                    } else if (Character.isLetter(c)) {
                        txtCnt++;
                        //System.out.println(cPrime + " is a letter.");
                    } else if (Character.isWhitespace(c)) {
                        wspCnt++;
                        //System.out.println(cPrime + " is a whitespace.");
                    } else {
                        symbCnt++;
                        //System.out.println(cPrime + " is a symbol.");
                    }
                }
                System.out.println("Textual Character count: " + txtCnt);//option 3
                System.out.println("Numerical Character count: " + numCnt);
                System.out.println("WhiteSpace  Character count: " + wspCnt);
                System.out.println("Symbol  Character count: " + symbCnt);
            }
            else if (userA == 4) {
                System.out.println("Character Sorter Exited Successfully");
                return; //exit program
            }
            else {
                System.out.println("Error, bad input, please enter a number 1-4");
                userA = 0;
            }

        }
    }
    public static char[] strSort(char[] s_array){
        char temp;
        for(int i = 0; i < s_array.length; i++){
            for(int j = 0; j < s_array.length; j++){
                if (s_array[i] < s_array[j]){
                    temp = s_array[i];
                    s_array[i] = s_array[j];
                    s_array[j] = temp;
                }
            }
        }
        return s_array;
    }

    public static int maxFreq(int[] i_array){

        int maxF=0;
        for(int i = 0; i < i_array.length; i++){
            if (i_array[i] > maxF)
                maxF = i_array[i];

        }
        return  maxF;
    }

    public static int minFreq(int[] i_array){

        int minF=0;
        for(int i = 0; i < i_array.length; i++){
            if (i_array[i] <= minF )
                minF = i_array[i];

        }
        return  minF;
    }

    public static int[][] dimSort(int[] i_array){

        int maxFreq = 32256;
        int[][] dimfeq = new int[256][maxFreq];
        for(int i = 0; i < i_array.length; i++){
            if ( i_array[i] != 0 )	 {
                dimfeq[i][ i_array[i] ] = 1;
            }
        }
        return dimfeq;
    }


    public static int[] alphabeticalSort(String inputStr)
    {
        char[] srtA;
        int[] arrayM = new int[256];

        for ( int i = 0; i < inputStr.length(); i++ )
        {
            char character = inputStr.charAt( i );
            int ascii = ( int )character;
            //  System.out.println( character + " = " + Integer.toBinaryString( ascii ) );
            arrayM[ascii]++;
        }



        return arrayM;
    }



}