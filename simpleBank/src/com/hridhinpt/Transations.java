package com.hridhinpt;

public class Transations {
    private String customerName;
    private String customerAccountNumber;
    private String customerPhoneNumber;
    private String customerEmailAddress;
    private double customerAccountBalance;

    // Setting Account details

//    public void setCustomerName(String name){
//        customerName = name;
//    }
//    public void setCustomerAccountNumber(double accNum){
//        customerAccountNumber = accNum;
//    }
//    public  void setCustomerPhoneNumber(String phoneNumber){
//         customerPhoneNumber = phoneNumber;
//    }
//    public void setCustomerEmailAddress(String mail){
//        customerEmailAddress = mail;
//    }
//    public void setCustomerAccountBalance(double bal){
//        customerAccountBalance = bal;
//    }

    //Constructor setting

    public Transations(String customerName, String customerAccountNumber, String customerPhoneNumber, String customerEmailAddress, double customerAccountBalance){
        this.customerName = customerName;
        this.customerAccountNumber = customerAccountNumber;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerEmailAddress = customerEmailAddress;
        this.customerAccountBalance =customerAccountBalance;

    }



    // Transaction methods


    public String transferMoney(double amount){
        if(amount >customerAccountBalance){
            return ("InsufficientAmount. Your account balance :"+customerAccountBalance);
        }
        else{
            customerAccountBalance -=amount;
            return ("Transaction Successful Final balance "+customerAccountBalance);
        }
    }

    public String depositFund(double amount){
        if(amount == 0 || amount < 0){
            return "Enter a valid amount ";
        }
        else{
            customerAccountBalance +=amount;
            return ("Final balance "+customerAccountBalance);
        }
    }
    public double showBalance(){
        return customerAccountBalance;
    }





}
