package com.spring1;
import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Program to check for  Armstrong: ");

        Scanner sc = new Scanner(System.in);
        int myNumber = sc.nextInt();
        sc.close();

        int check1 = myNumber;
        int count = 0;
        int sum = 0;


        while(check1 != 0){
            count++;
            check1 = check1/10;
        }

        System.out.println(myNumber+" is a "+  count+ " digit number");

        check1 = myNumber;
        while(check1 != 0 ){
            int temp = check1%10;
            sum = (int) (sum+ Math.pow(temp,count));
            check1 = check1/10;
        }
        if(sum == myNumber){
            System.out.println("The given number is an armstrong number: ");
        }
        else {
            System.out.println("Given number is not an armstrong number:  ");
        }
    }
}
