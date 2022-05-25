package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int lineCounter = 0;
		System.out.println("Enter the file path name: ");
		//String[] input = userInput.nextLine().split(" ");
		String file = userInput.nextLine();
		System.out.println("Enter word to search: ");
		String wordToFind = userInput.nextLine();
		System.out.println("should search be case sensitive? "+ "(Y/N)");
		String caseSensitive = userInput.nextLine().toUpperCase();
		File fileInput = new File(file);
		try(Scanner BookFile = new Scanner(fileInput)) {
			while (BookFile.hasNextLine()){
				String lineOfText = BookFile.nextLine();
				lineCounter++;
				if (lineOfText.contains(wordToFind) && caseSensitive.contains("Y")){
					System.out.println(lineCounter + ": " + lineOfText);
				}
				if (lineOfText.toLowerCase().contains(wordToFind.toLowerCase()) && caseSensitive.contains("N")){
					System.out.println(lineCounter + ": " + lineOfText);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getStackTrace());
		}


	}

}
