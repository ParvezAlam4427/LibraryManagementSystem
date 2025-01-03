package com.library.controller;

import com.library.model.Book;
import com.library.model.Library;
import com.library.view.LibraryView;

public class LibraryController {
    private Library library;
    private LibraryView view;

    // Constructor
    public LibraryController(Library library, LibraryView view) {
        this.library = library;
        this.view = view;
    }

    // Main loop to run the application
    public void run() {
        boolean running = true;

        while (running) {
            int choice = view.showMenu();

            switch (choice) {
                case 1:
                    addBook();
                    break;

                case 2:
                    viewBooks();
                    break;

                case 3:
                    removeBook();
                    break;

                case 4:
                    running = false;
                    view.showMessage("Exiting the system. Goodbye!");
                    view.closeScanner();
                    break;

                default:
                    view.showMessage("Invalid option. Please try again.");
            }
        }
    }

    // Method to add a book
    private void addBook() {
        int id = view.getBookId();

        // Check if a book with the same ID already exists
        if (library.findBookById(id) != null) {
            view.showMessage("A book with this ID already exists. Please try again.");
            return;
        }

        String title = view.getBookTitle();
        String author = view.getBookAuthor();

        Book newBook = new Book(id, title, author);
        library.addBook(newBook);
        view.showMessage("Book added successfully.");
    }

    // Method to view all books
    private void viewBooks() {
        StringBuilder booksInfo = new StringBuilder();
        for (Book book : library.getBooks()) {
            booksInfo.append(book.toString()).append("\n");
        }
        view.displayBooks(booksInfo.toString());
    }

    // Method to remove a book
    private void removeBook() {
        int id = view.getBookId();
        boolean removed = library.removeBook(id);
        if (removed) {
            view.showMessage("Book removed successfully.");
        } else {
            view.showMessage("Book not found. Please check the ID and try again.");
        }
    }
}
