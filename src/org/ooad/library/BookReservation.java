package org.ooad.library;

import org.ooad.library.book.Book;
import org.ooad.library.contact.User;
import org.ooad.library.enums.ReservationStatus;

import java.time.LocalDate;
import java.util.Random;

public class BookReservation {
    Book book;
    ReservationStatus reservationStatus;
    User reservedBy;
    LocalDate reservedDate;
    int reservationId;

    private static BookReservation bookReservation;

    public static BookReservation getInstance() {

        if (bookReservation == null) {
            bookReservation = new BookReservation();
        }
        return bookReservation;
    }

    private BookReservation() {

    }

    public void reserveBook(Book book, User reservedBy) {
        this.book = book;
        this.reservedBy = reservedBy;
        this.reservedDate = LocalDate.now();
        this.reservationStatus = ReservationStatus.WAITING;
        this.reservationId = new Random().nextInt();
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public User getReservedBy() {
        return reservedBy;
    }

    public void setReservedBy(User reservedBy) {
        this.reservedBy = reservedBy;
    }

    public LocalDate getReservedDate() {
        return reservedDate;
    }

    public void setReservedDate(LocalDate reservedDate) {
        this.reservedDate = reservedDate;
    }
}
