package com.devu;

public class data_type {
    public static void main(String [] args){
        System.out.println("Data_Type Exercise:");

        byte num1 = 100;
        short num2 = 200;
        int num3 = 3000;
        long num4 = 50000l + 10l *(num1 +num2 +num3);
        System.out.println(num4);

        //Getting the typeof a variable.
        System.out.println(((Object) num4).getClass().getName());

        int myIntVal = 5;
        float myFloat = 5.0F;
        double myDouble = 5.0;

        System.out.println( myIntVal);
        System.out.println( myFloat);
        System.out.println( myDouble);

        //casting from double to float.
        //any decimal literal by default is Double unless explicitly cast.
        float myNewFloat = (float) 5.25;
        System.out.println( myNewFloat);

        int myIntValue = 5/2;
        System.out.println(myIntValue);

        int myFloatVal = (int) (5.0/2.0);
        System.out.println(myFloatVal);


    }
}
