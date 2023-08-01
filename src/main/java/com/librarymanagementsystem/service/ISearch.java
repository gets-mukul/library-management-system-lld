package com.librarymanagementsystem.service;

import com.librarymanagementsystem.model.Book;

import java.util.Date;
import java.util.List;

public interface ISearch {

    public List<Book> searchByTitle(String title);
    public List<Book> searchByAuthor(String author);
    public List<Book> searchBySubject(String subject);
    public List<Book> searchByPubDate(Date publishDate);
}
