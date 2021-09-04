package com.hridhinpt;

public class Printer {
    private int tonerLevel;
    private int pagePrinted =0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel > -1 && tonerLevel <=100){
            this.tonerLevel = tonerLevel;
        }else{
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
    }
    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount <= 100) {
                this.tonerLevel += tonerAmount;
            } else {
                this.tonerLevel = -1;
            }
        } else {
            this.tonerLevel = -1;
        }
        return tonerLevel;
    }
    public int printPages(int pages){
        int pagesToPrint;
        if(duplex){
            System.out.println("Printing in Duplex Mode ");
            pagesToPrint = (pages / 2) + (pages % 2);
            this.pagePrinted += pagesToPrint;
            return pagesToPrint;
        }else{
            System.out.println("Printing in Non Duplex Mode ");
            pagesToPrint = pages;
            this.pagePrinted += pagesToPrint;
            return pagesToPrint;
        }

    }

    public int getPagePrinted() {
        return pagePrinted;
    }
}
