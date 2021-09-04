package com.hridhinpt;

public class MotherBoard {
    private int ramSlots;
    private int hddStorage;
    private String model;
    private String biosVersion;


    public MotherBoard(int ramSlots, int hddStorage, String model, String biosVersion) {
        this.ramSlots = ramSlots;
        this.hddStorage = hddStorage;
        this.model = model;
        this.biosVersion = biosVersion;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getHddStorage() {
        return hddStorage;
    }

    public String getModel() {
        return model;
    }

    public String getBiosVersion() {
        return biosVersion;
    }
}
