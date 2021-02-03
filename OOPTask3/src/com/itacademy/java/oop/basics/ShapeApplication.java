package com.itacademy.java.oop.basics;

public class ShapeApplication {
    public static void main(String[] args) {
    Square first = new Square(100,500);
    Square second = new Square();
    second.setLength(50);
    second.setWidth(500);
    Square third = new Square(-100,500);
    Square[] squares=  {first,second,third};
        for (Square square: squares) {
            if(square.getLength() < 0 || square.getWidth() < 0){
                System.out.println("Error, negative value(s): width: "+ square.getWidth() + " , length: "+ square.getLength()  );
            }else{
                System.out.println("Good square : width: "+ square.getWidth() + " , length: "+ square.getLength() +
                        ". Area: "+ square.getArea() +", perimeter: "+ square.getPerimeter()  );
                System.out.println(square.getAllInfo()); //Get all info method

            }
        }
    }
}
