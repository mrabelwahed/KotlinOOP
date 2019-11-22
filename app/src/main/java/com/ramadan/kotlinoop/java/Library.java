package com.ramadan.kotlinoop.java;

import com.ramadan.kotlinoop.kotlin.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> bookList = new ArrayList<>();

    private  void addBook(Book book){
        book.setTitle("#-"+book.getTitle());
        bookList.add(book);
    }
}
