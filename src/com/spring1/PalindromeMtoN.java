package com.spring1;
import java.util.*;

public class PalindromeMtoN {
    public static void main(String[] args) {
        System.out.println("Palindrome from M to N: ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first range: ");
        int firstRange = sc.nextInt();
        System.out.println("Enter the second range: ");
        int secondRange = sc.nextInt();
        sc.close();

        calculatePalindrome(firstRange,secondRange);
    }
    static void calculatePalindrome( int range1 , int range2){
        for( int i = range1 ; i <= range2 ; i++){

            int num = i;
            int sum = 0;

            while( num != 0){
                int temp = num%10;
                sum = sum*10 + temp;
                num = num/10;
            }
            if(sum == i){
                System.out.println(i);
            }
        }
    }
}
