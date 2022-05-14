package com.techelevator;

public class Elevator {
    int currentFloor = 1;
    int numberOfFloors;
    boolean doorOpen = false;
//Constructor
    public Elevator(int numberOfLevels) {
        this.numberOfFloors = numberOfLevels;
    }
//getters and setters
    public boolean isDoorOpen() {
        return doorOpen;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void openDoor() {
        if (!doorOpen) {
            doorOpen = true;
        }
    }

    public void closeDoor() {
        if (doorOpen) {
            doorOpen = false;
        }
    }

    public void goUp(int desiredFloor) {
        if (!doorOpen && desiredFloor <= numberOfFloors && desiredFloor > currentFloor) {
            for (int i = 0; i < numberOfFloors; i++)
                if (currentFloor != desiredFloor) {
                    currentFloor++;
                } else if (currentFloor == desiredFloor) {
                    break;
                }
        }
    }

    public void goDown(int desiredFloor) {
        if (!doorOpen && desiredFloor <= numberOfFloors && desiredFloor < currentFloor && desiredFloor>=1) {
            for (int i = 0; i < numberOfFloors; i++) {
                currentFloor--;
                if (currentFloor == desiredFloor) {
                    break;
                }
            }
        }
    }
}
