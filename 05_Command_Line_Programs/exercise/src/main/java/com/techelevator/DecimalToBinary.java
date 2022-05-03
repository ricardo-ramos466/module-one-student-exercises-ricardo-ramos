package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter in a series of decimal value" +
				" separated by spaces: ");
		String value =  input.nextLine();
		String[] separateNumbers = value.split(" ");

		String[] separateNumbersToBinary = new String[separateNumbers.length];
		for (int i = 0; i< separateNumbers.length; i++){
			int separateNumbersToInt = Integer.parseInt(separateNumbers[i]);
			separateNumbersToBinary[i]= Integer.toBinaryString(separateNumbersToInt);
			System.out.println(separateNumbersToInt+" in binary is " +separateNumbersToBinary[i]);
		}
	}

}
