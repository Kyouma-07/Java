package com.devu;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args){
        System.out.println("Programm to check prime number:");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.close();

        for( int i = 2 ;i <  num/2 ; i++) {
            int flag = 0;
            if( num% i  == 0) {
                flag++;
                System.out.println("Not a prime number");
                break;
            }
        }
        System.out.println("Is a prime number:");
    }
}
