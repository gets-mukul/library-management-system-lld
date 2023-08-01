package com.librarymanagementsystem.model;

import com.librarymanagementsystem.constant.ReservationStatus;

import java.util.Date;

public class BookReservation {
    private Date creationDate;
    private ReservationStatus status;
    private String bookItemBarcode;
    private String memberId;
}
