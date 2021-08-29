package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        while (true){
            int printCount = count+1;
            System.out.println("Enter number "+printCount +":");
            boolean nextInput = scanner.hasNextInt();
            if(nextInput){
                int number = scanner.nextInt();
                sum +=number;
                count++;
                if(count == 10){
                    break;
                }
            }else{
                System.out.println("Enter a valid input ");
            }



        }scanner.close();
        System.out.println("Sum is ="+sum);

    }
}
