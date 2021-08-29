package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int ageNow =2021;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter birth Year :");
        boolean yearInput = scanner.hasNextInt();
        if (yearInput){
            int year = scanner.nextInt();
            System.out.println("First Name :");
            String firstName =scanner.nextLine();
            System.out.println("Last Name :");
            String lastName = scanner.nextLine();
            System.out.println("Hello "+firstName +" "+ lastName);
            System.out.println("Your age is "+ageNow);

        }







    }
}
