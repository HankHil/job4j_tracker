package ru.job4j.pojo;

public class Book {
    private String bookName;
    private int page;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public Book(String bookName, int page) {
        this.bookName = bookName;
        this.page = page;


    }
}
