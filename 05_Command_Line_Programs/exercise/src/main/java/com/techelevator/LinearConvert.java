package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

    public static void main(String[] args) {
        System.out.println("Enter f to convert feet to meters, or m to convert meters to feet: ");
        Scanner input = new Scanner(System.in);
        String feetOrMeters = input.next();
        if (feetOrMeters.equalsIgnoreCase("f")) {
            System.out.println("Enter number of feet: ");
            input = new Scanner(System.in);
            double numberOfFeet = Double.parseDouble(input.nextLine());
            double metersFromFeet = numberOfFeet * 0.3048;
            System.out.println(numberOfFeet + " feet is " +Math.round(metersFromFeet*1000.00)/1000.00 + " meters.");
        } else if (feetOrMeters.equalsIgnoreCase("m")) {
            System.out.println("Enter number of meters: ");
            input = new Scanner(System.in);
            double numberOfMeters = Double.parseDouble(input.nextLine());
            double feetFromMeters = numberOfMeters * 3.281;
            System.out.println(numberOfMeters + " meters is " + Math.round(feetFromMeters*1000.00)/1000.00 + " feet.");
        }
    }



}
