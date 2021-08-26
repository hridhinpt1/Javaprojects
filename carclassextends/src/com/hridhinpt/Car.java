package com.hridhinpt;

public class Car extends vehicle{
    private int enginePower;
    private int currentGear;
    private boolean isManuel;
    private int numberOfDoors;

    public Car(String name, String size, int enginePower, boolean isManuel, int numberOfDoors) {
        super(name, size);
        this.enginePower = enginePower;
        this.currentGear =1;
        this.isManuel = isManuel;
        this.numberOfDoors = numberOfDoors;
    }
    public void setCurrentGear(int currentGear){
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear change to "+this.currentGear);
    }
    public void changeVelocity(int direction , int velocity){
        moving(direction,velocity);
        System.out.println("Car.changeVelocity by "+velocity + " direction "+direction);
    }
    public void changeGearUp(){
        this.currentGear = this.currentGear +1;
        System.out.println("Gear changed to "+currentGear);
    }
    public void changeGearDown(){
        if(this.currentGear == 0){
            System.out.println("Car is not moving ");
        }
        else{
            this.currentGear -=1;
            System.out.println("Gear changed to "+currentGear);
        }
    }

    public int getEnginePower() {
        return enginePower;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public boolean isManuel() {
        return isManuel;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}
