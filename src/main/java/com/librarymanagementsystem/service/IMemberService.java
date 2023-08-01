package com.librarymanagementsystem.service;

import com.librarymanagementsystem.model.BookItem;

public interface IMemberService {
    int getTotalBookCheckout();

    int reserveBookItem(BookItem bookItem);

    int incrementTotalBooksCheckedout();

    boolean checkoutBookItem(BookItem bookItem);

    void checkForFine(String bookItemBarcode);

    void returnBookItem(BookItem bookItem);

    boolean renewBookItem(BookItem bookItem);
}
