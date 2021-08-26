package com.hridhinpt;

public class vehicle {
       private String name;
       private String size;

       private int currentVelocity;
       private int currentDirection;

        public vehicle(String name, String size) {
                this.name = name;
                this.size = size;

                this.currentVelocity = 0;
                this.currentDirection = 0;
        }
        public void steer(int direction){
                this.currentDirection = direction;
                System.out.println("Vehicle moving in the direction "+currentDirection+ " degrees");

        }
        public void moving(int direction , int velocity){
                this.currentDirection =direction;
                this.currentVelocity = velocity;
                System.out.println("Vehicle moving in the "+currentDirection+" with velocity "+currentVelocity);

        }

        public String getName() {
                return name;
        }

        public String getSize() {
                return size;
        }

        public int getCurrentVelocity() {
                return currentVelocity;
        }

        public int getCurrentDirection() {
                return currentDirection;
        }
}


