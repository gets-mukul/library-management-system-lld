package com.librarymanagementsystem.service.impl;

import com.librarymanagementsystem.model.Book;
import com.librarymanagementsystem.service.ISearch;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class CatalogService implements ISearch {
    @Override
    public List<Book> searchByTitle(String title) {
        return null;
    }

    @Override
    public List<Book> searchByAuthor(String author) {
        return null;
    }

    @Override
    public List<Book> searchBySubject(String subject) {
        return null;
    }

    @Override
    public List<Book> searchByPubDate(Date publishDate) {
        return null;
    }

    private HashMap<String, List<Book>> bookTitles;
    private HashMap<String, List<Book>> bookAuthors;
    private HashMap<String, List<Book>> bookSubjects;
    private HashMap<String, List<Book>> bookPublicationDates;
}
