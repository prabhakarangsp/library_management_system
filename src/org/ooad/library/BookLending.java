package org.ooad.library;

import org.ooad.library.book.BookItem;
import org.ooad.library.contact.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class LendItem {

    public LendItem(String itemId, LocalDate creationDate, LocalDate returnDate, String memberId) {
        this.itemId = itemId;
        this.creationDate = creationDate;
        this.returnDate = returnDate;
        this.memberId = memberId;
    }

    String itemId;
    LocalDate creationDate;
    LocalDate returnDate;
    String memberId;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
}

public class BookLending {

    private List<LendItem> lendedBooks;

    private static BookLending instance;

    private BookLending() {
        lendedBooks = new ArrayList<>();
    }

    public static BookLending getInstance() {
        if (instance == null) {
            instance = new BookLending();
        }
        return instance;
    }

    public void lendBook(BookItem bookItem, User member) {
        LocalDate bookedDate = LocalDate.now();
        getInstance().lendedBooks.add(new LendItem(bookItem.getBookNumber(), bookedDate, bookedDate.plusDays(15), member.getMemberId()));
    }

    public Optional<LendItem> fetchLendingDetails(BookItem bookItem) {
        return getInstance().lendedBooks.stream().filter(lendItem -> {
            return lendItem.getItemId().equalsIgnoreCase(bookItem.getBookNumber());
        }).findFirst();
    }
}
