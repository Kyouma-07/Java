package com.spring1;
import java.util.*;
public class PrimeMtoN {
    public static void main (String[] args){
        System.out.println("Finding out prime numbers from M to N:  " );

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number of Range:    ");
        int range1 = sc.nextInt();
        System.out.println("Enter the second number of range:   ");
        int range2 = sc.nextInt();
        sc.close();

        for( int i = range1 ; i<= range2 ; i++){
            boolean flag = true;
            for( int j = 2 ; j <= Math.sqrt(i); j++){

                if( i%j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.print(i+" ");
            }
        }
    }
}
