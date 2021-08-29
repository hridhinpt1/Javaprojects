package com.hridhinpt;

public class StudyTable {
    private String laptop;
    private int numberOfBooks;
    private ReadingBook nowReadingBook;

    public StudyTable(String laptop, int numberOfBooks, ReadingBook nowReadingBook) {
        this.laptop = laptop;
        this.numberOfBooks = numberOfBooks;
        this.nowReadingBook = nowReadingBook;
    }

    public String getLaptop() {
        return laptop;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public ReadingBook getNowReadingBook() {
        return nowReadingBook;
    }
}
