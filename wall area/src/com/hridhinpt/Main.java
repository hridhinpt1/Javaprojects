package com.hridhinpt;

public class Main {

    public static void main(String[] args) {
	Wall wall = new Wall();
	wall.setWidth(1.25);
	wall.setHeight(1.25);
        System.out.println(wall.getHeight());
        System.out.println(wall.getWidth());
        System.out.println(wall.getArea());
    }
}
