package com.spring1;
import java.util.*;

public class LeapYearMtoN {
    public static void main(String[] args) {
        System.out.println("Program to find Leap Year in a range: ");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first range: ");
        int range1 = sc.nextInt();
        System.out.println("Enter the Second range: ");
        int range2 = sc.nextInt();

        sc.close();

        for ( int i = range1 ; i<= range2 ;i++){
            if( (i%4 == 0 && i%100 != 0) || (i%400 == 0)){
                System.out.print(i+ " ");
            }
        }
    }
}
