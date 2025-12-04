package org.ooad.library.contact;

import org.ooad.library.BookReservation;
import org.ooad.library.book.BookItem;

import java.time.LocalDate;


public class Member extends User {
    LocalDate membershipStartDate;
    int totalBooksCheckedOut;

    public int reserveBookItem(BookItem bookItem) {
        BookReservation.getInstance().reserveBook(bookItem, this);
    }

    public void checkOutBook(BookItem bookItem) {

    }

    public void returnBookItem(BookItem bookItem) {

    }

    public void renewBookItem(BookItem bookItem) {

    }

    public LocalDate getMembershipStartDate() {
        return membershipStartDate;
    }

    public void setMembershipStartDate(LocalDate membershipStartDate) {
        this.membershipStartDate = membershipStartDate;
    }

    public int getTotalBooksCheckedOut() {
        return totalBooksCheckedOut;
    }

    public void setTotalBooksCheckedOut(int totalBooksCheckedOut) {
        this.totalBooksCheckedOut = totalBooksCheckedOut;
    }
}
