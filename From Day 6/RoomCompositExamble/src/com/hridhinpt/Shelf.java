package com.hridhinpt;

public class Shelf {
    private double money;
    private String jewellery;

    public Shelf(double money, String jewellery) {
        this.money = money;
        this.jewellery = jewellery;
    }

    public void hasKey(){
        if(check()){
            System.out.println(getMoney());
            System.out.println(getJewellery());

        }

    }

    private double getMoney() {
        return money;
    }

    private String getJewellery() {
        return jewellery;
    }
}
