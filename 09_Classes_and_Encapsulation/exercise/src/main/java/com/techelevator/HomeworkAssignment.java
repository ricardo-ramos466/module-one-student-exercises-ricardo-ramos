package com.techelevator;

public class HomeworkAssignment {
    private int earnedMarks;
    private int possibleMarks;
    private String submitterName = null;
    private String letterGrade = null;
 // getters and setters
    public int getPossibleMarks() {
        return possibleMarks;
    }

    public int getEarnedMarks() {
        return earnedMarks;
    }

    public String getLetterGrade() {
        int grade = ((this.earnedMarks*100)/this.possibleMarks);
        String letterGrade = "F";
        if (grade>=90){
            letterGrade = "A";
        }
        else if (grade>=80){
            letterGrade = "B";

        }
        else if (grade>=70){
            letterGrade = "C";

        }
        else if (grade>=60){
            letterGrade = "D";

        }

        return letterGrade;
    }

    public String getSubmitterName() {
        return submitterName;
    }

    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }

// constructor
    public HomeworkAssignment (int possibleMarks, String submitterName){
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }

}
