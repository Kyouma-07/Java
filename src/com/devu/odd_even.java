
package com.devu;
public class odd_even {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 10; i++) {

            if ( i%2  != 0){
                System.out.println(i + " is a not an even number");
            }
            else
                System.out.println(i+ " is an even number");
        }
    }
}
