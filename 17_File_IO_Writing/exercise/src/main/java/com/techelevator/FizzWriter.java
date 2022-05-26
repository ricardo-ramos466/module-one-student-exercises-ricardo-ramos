package com.techelevator;

import javax.xml.transform.Source;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter file destination: ");
		String destinationFileName = userInput.nextLine();
		File destinationFile = new File(destinationFileName);
		try(PrintWriter writer = new PrintWriter(destinationFile)){
			int count = 1;
			while (count<=300){
				if(count%5==0 && count%3==0){
					writer.println("FizzBuzz");
					count++;
				}
				else if(count%5==0){
					writer.println("Buzz");
					count++;
				}
				else if(count%3==0){
					writer.println("Fizz");
					count++;
				}
				else{
					writer.println(count);
					count++;
				}
			}

		}catch (Exception e){
			System.out.println("Destination path invalid!");
		}

	}

}
