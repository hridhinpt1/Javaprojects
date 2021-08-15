package com.hridhinpt;

public class Main {

    public static void main(String[] args) {
	Person person = new Person();
	person.setFirstName("");
	person.setLastName("");
        System.out.println("Name :"+person.getFullName());
    }
}
