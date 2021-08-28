package com.hridhinpt;

public class Main {

    public static void main(String[] args) {
//	vehicle bus = new vehicle("tutu","50");
//	bus.steer(50);
//	System.out.println(bus.getName());
	RangeRover owner1 = new RangeRover("5",false,4,100);
	owner1.autoGear(20);
	owner1.autoGear(40);
	owner1.autoGear(80);
	owner1.autoGear(50);

    }
}
