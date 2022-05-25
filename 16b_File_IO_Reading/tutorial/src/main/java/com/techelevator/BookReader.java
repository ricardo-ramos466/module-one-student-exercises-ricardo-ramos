package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BookReader {
    static private final String BEGIN_MARKER = "*** START OF";
    static private final String END_MARKER = "*** END OF";
    public static void main(String[] args) {
        /*
         * This book-reader program opens a file that was downloaded from https://www.gutenberg.org/, reads
         * through the copyright information at the top until it finds the start of the book content, and
         * then displays the content to the user. It also counts the total lines of book content between the
         * start and the end markers.
         */

        /*
        Step 1: Prompt the user for a filename
         */
        // Create a scanner for user input
        Scanner userInput = new Scanner(System.in);
        // Prompt the user for a file path - path should look like "data/jekyll-and-hyde.txt"
        System.out.print("Enter path to the book file: ");
        String filePath = "tutorial/data/" + userInput.nextLine().replace(" ","-").toLowerCase() +".txt";

        /*
        Step 2: Step Two: Open the book file and handle errors
         */
        // Create a File object using the path
        File bookFile = new File(filePath);
        int lineCount = 0;
        int blankLineCounter = 0;
        //Open the file
        try (Scanner fileInput = new Scanner(bookFile)){
            /*
            Step 3: Create a read loop and process the lines
             */
            boolean inBookText = false; // Are you reading between the start and end markers?
            // loop until the end of file is reached
            while (fileInput.hasNextLine()){
                // Read the next line into 'lineOfText'
                String lineOfText = fileInput.nextLine();
                 /*
                Step 4: Skip the header information before book content
                 */
                if (lineOfText.startsWith(BEGIN_MARKER)){
                    inBookText = true;
                    continue; // no need to process this...go to the next
                }
                if (lineOfText.startsWith(END_MARKER)){
                    break;
                }
                if (inBookText) {
                    // Increment the line count.
                    lineCount++;
                    //Print the line
                    if(lineOfText.length()==0 && blankLineCounter==0){
                        blankLineCounter++;
                        System.out.println(lineCount + ": " + lineOfText);
                    }
                     if(lineOfText.length()!=0){
                         blankLineCounter = 0;
                         System.out.println(lineCount + ": " + lineOfText);
                     }
                }

            }
        } catch (FileNotFoundException e){
            System.out.println("The file was not found" + bookFile.getAbsolutePath());
        }
        System.out.println("Found " + lineCount + " lines of text in " + filePath);
    }
}
