package com.devu;

import java.awt.*;

public class Operators {
    public static void main(String[] args) {
        System.out.println("Learning Operators");

        //assignment operators
        int topScore = 100;

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
    }



}
