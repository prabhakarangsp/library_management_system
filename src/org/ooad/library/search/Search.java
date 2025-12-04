package org.ooad.library.search;

import org.ooad.library.book.Book;

import java.time.LocalDate;
import java.util.List;

public interface Search {
    public List<Book> searchByBookName(String bookName);

    public List<Book> searchByAuthorName(String authorName);

    public List<Book> searchByPublication(String publication);

    public List<Book> searchByPublishedDate(LocalDate publishedDate);
}
