package com.devu;

import java.awt.*;

public class Operators {
    public static void main(String[] args) {
        System.out.println("Learning Operators");

        //assignment operators
        int topScore = 100;

        //Relational Operators  (often used with if-else or conditions)
        //not equals to
        if (topScore != 100) {
            System.out.println("Top Score is not 100");
        }

        //greater than or maybe greater than equals to >=
        else if (topScore > 100) {
            System.out.println("Top Score is greater than 100");
        }

        //less than or maybe or less than equals too
        else if (topScore < 100) {
            System.out.println("Top Score is Less than 100");
        }
        else{
            System.out.printf("Top Score is 100");
        }


        //Logical Operators
        int secondScore = 101;


        //Logical AND &&
        if( (topScore < secondScore) && (topScore < 200)) {
            System.out.println("SecondScore is  greater then First score and it is less than 200");
        }

        //Arithmetic Operators
        int x = 20;
        int y = 10;

        System.out.println( x+y);
        System.out.println(x-y);
        System.out.println(x/y);
        System.out.println(x%y); //returns remainder after division
        System.out.println(x*y);


        //always use variable of perform the operation in bracket
        System.out.println("Sum is: " +x +y); //will result is string concatenation.
        System.out.println("Sum is: "+ (x+y));


        //assignment operators
        x += 5; //x = x+5;
        System.out.println(x);
        x -= 5;
        System.out.println(x);
        x /= 5;
        System.out.println(x);
        x *= 5;
        System.out.println(x);
        x %= 5;
        System.out.println(x);


        String name_1 = "Kyouma";
        String name_2 = name_1;
        String name_3 = new String("Kyouma");

        System.out.println(name_1 == name_2);
        System.out.println(name_1 == name_3);

        //BitWise Operators




    }



}
