package com.hridhinpt;

public class OneOneTwo {

    private int NumberOfRows = 0;
    private int rows = 0;

    public OneOneTwo(int rows){
        this.NumberOfRows =rows;
    }

    public void drawPatter(){
        for(int i = 0;i<NumberOfRows;i++){
            String num = " ";
            for(int j =1;j<=i;j++){
                num+=j;
            }
            System.out.println(num);
        }

    }






}
