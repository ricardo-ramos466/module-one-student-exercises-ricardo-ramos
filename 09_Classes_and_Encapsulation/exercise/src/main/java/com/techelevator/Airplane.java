package com.techelevator;

public class Airplane {
    private String planeNumber = null;
    private int totalFirstClassSeats;
    private int bookedFirstClassSeats;
    //public int availableFirstClassSeats = this.totalFirstClassSeats - this.bookedFirstClassSeats;
    private int totalCoachSeats;
    private int bookedCoachSeats;
   // public int availableCoachSeats = this.totalCoachSeats - this.bookedCoachSeats;
// getters and setters
    public int getAvailableCoachSeats() {
        return totalCoachSeats - bookedCoachSeats;
        //return availableCoachSeats;
    }

    public int getAvailableFirstClassSeats() {
        return totalFirstClassSeats - bookedFirstClassSeats;
        // return availableFirstClassSeats;
    }

    public int getBookedCoachSeats() {
        return bookedCoachSeats;
    }

    public int getBookedFirstClassSeats() {
        return bookedFirstClassSeats;
    }

    public int getTotalCoachSeats() {
        return totalCoachSeats;
    }

    public int getTotalFirstClassSeats() {
        return totalFirstClassSeats;
    }

    public String getPlaneNumber() {
        return planeNumber;
    }

// constructor
    public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
        this.planeNumber = planeNumber;
        this.totalCoachSeats = totalCoachSeats;
        this.totalFirstClassSeats = totalFirstClassSeats;

    }

    public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
        if (forFirstClass && totalFirstClassSeats - bookedFirstClassSeats >= totalNumberOfSeats) {
            bookedFirstClassSeats += totalNumberOfSeats;
            return true;
        } else if (!forFirstClass && totalCoachSeats - bookedCoachSeats >= totalNumberOfSeats) {
            bookedCoachSeats += totalNumberOfSeats;
            return true;
        } else {
            return false;
        }
    }
}
