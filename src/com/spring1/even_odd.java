package com.spring1;

import java.util.Scanner;

public class even_odd {
    public static void main (String[] args){
        System.out.println("Even Odd programm:");

        //taking user input:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number you want to check for even or odd: ");
        int myNumber = sc.nextInt();

        if(myNumber%2 == 0){
            System.out.println(myNumber+ "  is an even number");
        }
        else{
            System.out.println(myNumber + " is not an even number");
        }

        sc.close();

    }
}
