package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		System.out.println("Enter Temperature: ");
		Scanner input = new Scanner(System.in);
		double temperature = Double.parseDouble(input.nextLine());
		double fToC = (temperature-32)/1.8;
		double cToF = temperature*1.8+32;
		System.out.println("Is temperature (C)elcius or (F)arenheit: ");
		input = new Scanner(System.in);
		String celsiusOrFarenheit = input.nextLine();
		if (celsiusOrFarenheit.equalsIgnoreCase("f")){
			System.out.println(temperature+"°F is "+Math.round(fToC*1000.00)/1000.00+"°C");
		}
		else{
			System.out.println(temperature+"°C is "+Math.round(cToF*1000.00)/1000.00+"°F");
		}
	}

}
