package com.devu;

import java.io.IOException;
import java.util.Scanner;

public class UnderStandingInput {
    public static void main(String[] args) throws IOException {

        System.out.println("Understanding Input in Java:");

        // read() method always returns an integer and reds 1 byte at a time.
        //ASCII of first character is returned.
        // it will throw and I/0 exception.
        int name = System.in.read();
        System.out.println(name);

        //Scanner  Class Object acts as a buffer where we can specify the input source

        Scanner sc = new Scanner(System.in);

        //to take string input we use the nextLine() method with scanner class object
        String name1 = sc.nextLine();
        System.out.println(name1);

        System.out.println("Enter your ID:");
        int id1 = sc.nextInt();

        //this statement will eat the remaining /n or space
        sc.nextLine();


        System.out.println("Enter your name");
        String name3 = sc.nextLine();

        //takes input till /n
        //System.out.println("Enter your name:");
        //String name3 = sc.next();

        System.out.println("Enter your age:");
        byte age = sc.nextByte();

        System.out.println("Enter your salary:");
        double salary = sc.nextDouble();

        System.out.println("ID  : "+id1);
        System.out.println("Welcome : "+name3);
        System.out.println("Age  : "+age);
        System.out.println("Salary  : "+salary);

        //scanner object needs to be closed to avoid data leak using the close() method.
        sc.close();


    }
}