package com.librarymanagementsystem.service;

import com.librarymanagementsystem.model.BookLending;

public interface IBookLendingService {
    boolean lendBook(String barcode, String memberId);

    BookLending fetchLendingDetails(String barcode);
}
