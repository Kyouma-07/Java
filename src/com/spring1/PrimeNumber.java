package com.spring1;

import java.util.Scanner;

public class PrimeNumber {
    public  static void main(String[] args){
        System.out.println("Program to check for prime number:");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check for prime number:    ");

        int myNumber = sc.nextInt();
        boolean flag = true;
        sc.close();

        for ( int i = 2 ; i <= Math.sqrt(myNumber) ; i++){
            if ( myNumber % i == 0){
                flag = false;
                System.out.println(myNumber+" is not a Prime Number");
                break;
            }
        }
        if(flag){
            System.out.println(myNumber+ " is a Prime Number");
        }
    }
}
