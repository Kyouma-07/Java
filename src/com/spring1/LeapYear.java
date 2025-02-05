package com.spring1;

import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Program to check for leap year: ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to check for leap year:    ");
        int myYear = sc.nextInt();
        sc.close();

        if((myYear%4 == 0 && myYear%100 != 0) || (myYear%400 == 0)){
            System.out.println(myYear+"  is a Leap Year");
        }
        else{
            System.out.println(myYear+ " is not a leap Year");
        }
    }
}
