package com.hridhinpt;

public class Monitor {
    private String model;
    private String manufacturer;
    private Resoluction resoluction;

    public Monitor(String model, String manufacturer, Resoluction resoluction) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.resoluction = resoluction;
    }
    public void drawPixelAt(int x ,int y,String color ){
        System.out.println("Drawing pixel at"+x +y +color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Resoluction getResoluction() {
        return resoluction;
    }
}
