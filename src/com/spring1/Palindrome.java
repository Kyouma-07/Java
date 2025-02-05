package com.spring1;
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Program for Palindrome: ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check for palindrome: ");

        int myNumber = sc.nextInt();
        sc.close();

        int check = myNumber;
        int sum = 0;

        while(check != 0){
            int temp = check%10;
            sum = sum*10 + temp;
            check = check/10;
        }
        if(myNumber == sum){
            System.out.println(myNumber+ " is a palindrome number:");
        }
        else{
            System.out.println(myNumber+ " is not a palindrome number: ");
        }

    }
}
