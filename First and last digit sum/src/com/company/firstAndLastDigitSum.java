package com.company;

public class firstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number){

        int firstNumber = number %10;
        int lastNumber = 0 ;
        int sum = 0;
        if(number < 0){
            return -1;
        }
        while(number >9){
            number = number/10;
        }
        lastNumber = number;
        sum = firstNumber + lastNumber;
        return sum ;

    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(2005));
    }

}
