package com.library.model;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    // Constructor
    public Library() {
        books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Retrieve all books
    public List<Book> getBooks() {
        return books;
    }

    public boolean removeBook(int id) {
        return books.removeIf(book -> book.getId() == id);
    }

    // Find a book by its ID (optional, for extended functionality)
    public Book findBookById(int id) {
        return books.stream()
                    .filter(book -> book.getId() == id)
                    .findFirst()
                    .orElse(null);
    }
}
