package com.itacademy.java.oop.basics;

public class Square {
    private double length;
    private double width;

    public Square() {
    }

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    public  double getArea(){
        return width * length;
    }
    public  double getPerimeter(){
        return (width + length)*2;
    }

    public String getAllInfo() {
        return "Square{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + getArea() +
                ", perimeter =" + getPerimeter() +
                '}';
    }
}
