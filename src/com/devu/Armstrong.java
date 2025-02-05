package com.devu;

import java.util.Scanner;

public class Armstrong {
    public static void main (String [] args){
        System.out.println("Armstrong programm");

        //54748
        //5^5 +4^5 +7^5 +4^5 + 8^5 = 54748

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check for armstrong");
        int num = sc.nextInt();

        int check = num;
        int check2 = num;

        int count = 0;
        while(num != 0){
            num = num/10;
            count++;
        }
        int sum = 0;

        while(check != 0){
            int temp = check%10;
            sum  = (int) (sum + Math.pow(temp, count));
            check = check/10;
        }
        System.out.println("This is a " + count + " digit number");
        System.out.println(sum);

        if(sum == check2){
            System.out.println("This is an armstrong number");
        }
        else{
            System.out.println("Not an armstrong number");
        }
    }

}