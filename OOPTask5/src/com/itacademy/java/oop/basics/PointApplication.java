package com.itacademy.java.oop.basics;

import java.util.Arrays;

public class PointApplication {
    public static void main(String[] args) {
        MyPoint one = new MyPoint(10, 5);
        MyPoint two = new MyPoint(3, 7);
        one.setX(15);
        one.setY(13);
        System.out.println(one.getX());
        System.out.println(one.getY());
        two.setXY(10,15);
        System.out.println(two.getXY());
        System.out.println(two.toString());
        System.out.println(two.distance(10, 50));
        System.out.println(two.distance(one));
        System.out.println(one.distance());
        for (int point: one.getXY()) {
            System.out.println(point);
        }
        System.out.println(Arrays.toString(two.getXY()));
    }
}
