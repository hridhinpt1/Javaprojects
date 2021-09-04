package com.hridhinpt;

public class Main {

    public static void main(String[] args) {
	Printer printer = new Printer(50,true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = "+printer.getPagePrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Page prainted was "+pagesPrinted +"new total print count for printer "+printer.getPagePrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Page prainted was "+pagesPrinted +"new total print count for printer "+printer.getPagePrinted());
    }
}
