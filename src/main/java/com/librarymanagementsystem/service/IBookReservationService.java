package com.librarymanagementsystem.service;

import com.librarymanagementsystem.model.BookReservation;

public interface IBookReservationService {

    BookReservation fetchReservationDetails(String barcode);
}
