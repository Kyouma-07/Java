package com.devu;

public class CommandLineArgs {
    public static void main(String[] args) {

        System.out.println("Understanding Command Line Arguments:");

        //Local Variables should be declared before use
            //wrong approach.
            //int x;
            //int y;
            //int z = x+y;
            //System.out.println(z);

        //correct approach
        String firstName = args[0];
        String middleName = args[1];
        String lastName = args[2];
        System.out.println(firstName+ " "+ middleName+ " "+lastName);


        //type casting explicitly ,

        //converting string into integer data type explicitly.
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = x +y;
        System.out.println(z);

    }
}
