package org.ooad.library.search;

import org.ooad.library.book.Book;

import java.time.LocalDate;
import java.util.List;

public class CatalogSearch implements Search {
    BooksMetaData booksMetaData;

    public CatalogSearch(BooksMetaData booksMetaData) {
        this.booksMetaData = booksMetaData;
    }

    @Override
    public List<Book> searchByBookName(String bookName) {
        //logic to filter books for given name
        return List.of();
    }

    @Override
    public List<Book> searchByAuthorName(String authorName) {
        //logic to filter books by author name
        return List.of();
    }

    @Override
    public List<Book> searchByPublication(String publication) {
        //logic to filter books by publication
        return List.of();
    }

    @Override
    public List<Book> searchByPublishedDate(LocalDate publishedDate) {
        //login to filter books by published date
        return List.of();
    }
}
