package com.ramadan.kotlinoop.java;
public class Book {

    private String title;
    private String desc;
    private long isbn;

    public  Book(String title , String desc  , long isbn){
        this.title = title;
        this.desc = desc;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }
}
