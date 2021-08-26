package com.hridhinpt;

public class VipCustomer {
    private String fieldName;
    private double creditLimit;
    private String email;
    private String amount;

    public VipCustomer(String fieldName, double creditLimit ,String email){
        this.fieldName =fieldName;
        this.creditLimit =creditLimit;
        this.email =email;

    }
    public VipCustomer(String fieldName,String email){
        this.fieldName =fieldName;
        this.email = email;
        this.creditLimit = 500000;
    }
    public VipCustomer(){
        this.fieldName = "Default";
        this.email ="Default";
        this.creditLimit = 500000;
    }
    public void GetDetails(){
        System.out.println("Customer Name "+fieldName);
        System.out.println("Customer Email "+email);
        System.out.println("Credit Limit "+creditLimit);

    }


}
