package org.ooad.library.search;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BooksMetaData {
    List<String> bookTitles;
    List<String> bookAuthors;
    List<String> bookPublications;
    List<LocalDate> publishedDate;

    private static BooksMetaData instance;

    public static BooksMetaData getInstance() {

        if (instance == null) {
            instance = new BooksMetaData();
        }

        return instance;
    }

    private BooksMetaData() {
        bookTitles = new ArrayList<>();
        bookAuthors = new ArrayList<>();
        bookPublications = new ArrayList<>();
        publishedDate = new ArrayList<>();
    }

    public void addBookTitle(String bookTitle) {
        this.bookTitles.add(bookTitle);
    }

    public void addBookAuthors(String bookAuthor) {
        this.bookAuthors.add(bookAuthor);
    }

    public void addBookPublications(String publication) {
        this.bookPublications.add(publication);
    }

    public void addPublishedDate(LocalDate date) {
        this.publishedDate.add(date);
    }

    public List getBookTitles() {
        return bookTitles;
    }

    public void setBookTitles(List bookTitles) {
        this.bookTitles = bookTitles;
    }

    public List getBookAuthors() {
        return bookAuthors;
    }

    public void setBookAuthors(List bookAuthors) {
        this.bookAuthors = bookAuthors;
    }

    public List getBookPublications() {
        return bookPublications;
    }

    public void setBookPublications(List bookPublications) {
        this.bookPublications = bookPublications;
    }

    public List getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(List publishedDate) {
        this.publishedDate = publishedDate;
    }
}
