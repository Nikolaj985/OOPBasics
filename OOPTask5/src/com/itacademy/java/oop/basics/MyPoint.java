package com.itacademy.java.oop.basics;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXY() {
        int[] array = {x, y};
        return array;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }



    public double distance(int x, int y){
        double powerDistance = Math.pow((this.x - x),2) +Math.pow((this.y - y),2);
        return Math.sqrt(powerDistance);
    }
    public double distance(MyPoint point){
        double powerDistance = Math.pow((this.x - point.x),2) +Math.pow((this.y - point.y),2);
        return Math.sqrt(powerDistance);
    }
    public double distance(){
        double powerDistance = Math.pow((this.x),2) +Math.pow((this.y),2);
        return Math.sqrt(powerDistance);
    }

    @Override
    public String toString() {
        return '(' + x + "," + y + ')';
    }
}
