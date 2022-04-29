package com.techelevator;

import java.util.Scanner;

public class KilometerConverter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a kilometer value to start at: ");
        String value = input.next();
        int kilometerStart = Integer.parseInt(value);

        System.out.println("Enter Kilometer value to end with: ");
        value = input.next();
        int kilometerEnd = Integer.parseInt(value);

        System.out.println("How many should it increment by: ");
        value = input.next();
        int incrementBy = Integer.parseInt(value);

        System.out.println("Going from " + kilometerStart + "km to " + kilometerEnd
                + "km in increments of " + incrementBy + "km.");
    }


    
}
