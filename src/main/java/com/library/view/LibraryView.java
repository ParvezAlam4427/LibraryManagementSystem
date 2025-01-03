package com.library.view;

import java.util.Scanner;

public class LibraryView {
    private Scanner scanner;

    // Constructor
    public LibraryView() {
        scanner = new Scanner(System.in);
    }

    // Display the main menu and get user choice
    public int showMenu() {
        System.out.println("\n=== Library Management System ===");
        System.out.println("1. Add Book");
        System.out.println("2. View Books");
        System.out.println("3. Remove Book");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a number between 1 and 4: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    // Prompt user for book ID
    public int getBookId() {
        System.out.print("Enter book ID: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a valid integer ID: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    // Prompt user for book title
    public String getBookTitle() {
        System.out.print("Enter book title: ");
        scanner.nextLine(); // Consume newline left-over
        return scanner.nextLine();
    }

    // Prompt user for book author
    public String getBookAuthor() {
        System.out.print("Enter book author: ");
        return scanner.nextLine();
    }

    // Display list of books
    public void displayBooks(String books) {
        System.out.println("\n--- Books in the Library ---");
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println(books);
        }
    }

    // Display a single message
    public void showMessage(String message) {
        System.out.println(message);
    }

    // Close the scanner (optional, good practice)
    public void closeScanner() {
        scanner.close();
    }
}
