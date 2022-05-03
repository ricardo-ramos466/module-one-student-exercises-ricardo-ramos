package com.techelevator;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("Enter Fibonacci Number: ");
        Scanner number = new Scanner(System.in);
        int value = Integer.parseInt(number.nextLine());
        int a=0;
        int b=1;
        int c= a+b;
        System.out.print(a+", "+b);
        if (value>=1){
            while (c<=value){
                System.out.print(", "+c);
                a=b;
                b=c;
                c=a+b;
            }
        }
    }


}
