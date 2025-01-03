package com.library.model;

public class Book {
    private int id;
    private String title;
    private String author;

    // Constructor
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for id (optional)
    public void setId(int id) {
        this.id = id;
    }

    // Setter for title (optional)
    public void setTitle(String title) {
        this.title = title;
    }

    // Setter for author (optional)
    public void setAuthor(String author) {
        this.author = author;
    }

    // Override toString() for easy display
    @Override
    public String toString() {
        return "ID: " + id + ", Title: \"" + title + "\", Author: " + author;
    }
}
