package com.hridhinpt;

public class RangeRover extends Car{
    private int serviceExpiry;

    public RangeRover(String size, boolean isManuel, int numberOfDoors, int serviceExpiry) {
        super("Range Rover", size, 4000, isManuel, numberOfDoors);
        this.serviceExpiry = serviceExpiry;
    }
    public void autoGear(int speed){
        int newVelocity = getCurrentVelocity() + speed;
//        int relatedVelocity = newVelocity;

        if(newVelocity == 0){
            changeGearUp();
        }else if(newVelocity >10 && newVelocity <30){
            changeGearUp();

        }else if(newVelocity >30 && newVelocity <60){
            changeGearUp();
        }

    }
}
