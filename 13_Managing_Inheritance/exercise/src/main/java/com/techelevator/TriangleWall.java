package com.techelevator;

public class TriangleWall extends Wall {
    private int base;
    private int height;
    public TriangleWall(String name,String color,int base, int height){
        super(name,color);
        this.base=base;
        this.height= height;
    }
    @Override
    public int getArea(){
        int area = (getBase()*getHeight())/2;
        return area;
    }

    public String toString(){
        return getName()+" ("+getBase()+"x"+getHeight()+") triangle";
    }

    public int getBase() {
        return this.base;
    }

    public int getHeight() {
        return this.height;
    }
}
