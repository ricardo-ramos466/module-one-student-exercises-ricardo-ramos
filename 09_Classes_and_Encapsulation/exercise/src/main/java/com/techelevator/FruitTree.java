package com.techelevator;

public class FruitTree {
private String typeOfFruit = null;
public int piecesOfFruitLeft = 0;
// getters and setters
    public int getPiecesOfFruitLeft() {
        return piecesOfFruitLeft;
    }

    public String getTypeOfFruit() {
        return typeOfFruit;
    }
    public boolean pickFruit (int numberOfPiecesToRemove ){
        if (numberOfPiecesToRemove>piecesOfFruitLeft){

            return false;
        }
        else {
            piecesOfFruitLeft -= numberOfPiecesToRemove;
            return true;
        }
    }
    //constructor
    public FruitTree(String typeOfFruit,int piecesOfFruitLeft){
        this.typeOfFruit = typeOfFruit;
        this.piecesOfFruitLeft = piecesOfFruitLeft;
    }
}
