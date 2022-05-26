package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is the search word?");
        String searchWord = userInput.nextLine();
        System.out.println("What is the replacement word?");
        String replacement = userInput.nextLine();
        System.out.println("What is the source file?");
        String pathToSourceFile = userInput.nextLine();
        System.out.println("What is the destination file?");
        String pathToDestinationFile = userInput.nextLine();
        File sourceFile = new File(pathToSourceFile);
        File destinationFile = new File(pathToDestinationFile);
        try (Scanner source = new Scanner(sourceFile);PrintWriter destination = new PrintWriter(destinationFile)){

            while(source.hasNextLine()){
                String lineText =  source.nextLine();
                destination.println(lineText.replaceAll(searchWord,replacement));
            }

        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }

    }

}
