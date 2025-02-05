package com.spring1;
import java.util.*;
public class ArmstrongMtoN {
    public static void main(String[] args) {
        System.out.println("Armstrong Numbers from M to N: ");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number of range: ");
        int range1 = sc.nextInt();
        System.out.println("Enter the second number of range: ");
        int range2= sc.nextInt();

        sc.close();

        for(int i = range1 ; i <= range2 ; i++){

            int check = i;
            int count = 0;

            while(check != 0) {
                check = check / 10;
                count++;
            }

            check = i;
            int sum = 0;

            while(check != 0){
                int temp = check%10;
                sum = (int) (sum + Math.pow(temp,count));
                check = check/10;
            }

            if(i == sum){
                System.out.println(i+ " ");
            }
        }

    }
}
