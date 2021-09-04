package com.hridhinpt;

import java.awt.*;

public class Table {
    private Dimension table;
    private int numberOfBooks;
    private String currentRead;

    public Table(Dimension table, int numberOfBooks,String currentRead) {
        this.table = table;
        this.numberOfBooks = numberOfBooks;
        this.currentRead = currentRead;
    }
    public void currentReadingBook(){
        System.out.println("Looking For current reading book");
        ReadingBook();
    }
    private void ReadingBook(){
        System.out.println("Current reading is"+currentRead);
    }


    public Dimension getTable() {
        return table;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }
}
