package com.librarymanagementsystem.model;

import com.librarymanagementsystem.constant.BookFormat;
import com.librarymanagementsystem.constant.BookStatus;

import java.util.Date;

public class BookItem extends Book{
    private String barcode;
    private boolean isReferenceOnly;
    private Date borrowed;
    private Date dueDate;
    private double price;
    private BookFormat format;
    private BookStatus status;
    private Date dateOfPurchase;
    private Date publicationDate;
    private Rack placedAt;

}
