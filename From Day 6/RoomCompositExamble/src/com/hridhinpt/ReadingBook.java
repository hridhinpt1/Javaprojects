package com.hridhinpt;

public class ReadingBook {
    private String bookName;
    private String author;
    private int pageNumber;

    public ReadingBook(String bookName, String author, int pageNumber) {
        this.bookName = bookName;
        this.author = author;
        this.pageNumber = pageNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageNumber() {
        return pageNumber;
    }
}
