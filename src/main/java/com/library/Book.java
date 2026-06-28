package com.library;

import java.util.logging.Logger;

public class Book {

    private static final Logger LOGGER = Logger.getLogger(Book.class.getName());

    // Private member variables to store the book's title, author, and borrowed status.
    private String title;
    private String author;
    private boolean isBorrowed;

    // Constructor to initialize
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    // Method to borrow a book.
    public void borrowBook() {
        // To check if the book is not already borrowed.
        if (!isBorrowed) {
            isBorrowed = true;
            LOGGER.info(() -> "Book is successfully borrowed: " + title);
        } else {
            LOGGER.info("Sorry, this book is already borrowed");
        }
    }

    // Method to return a book.
    public void returnBook() {
        // To check if the book is already borrowed.
        if (isBorrowed) {
            // BUG: status peminjaman tidak direset, buku tetap dianggap dipinjam
            isBorrowed = true;
            LOGGER.info(() -> "You've successfully returned the book: " + title);
        } else {
            // If the book wasn't borrowed, display a message.
            LOGGER.info("This book wasn't borrowed");
        }
    }

    // Method to check if the book is available (not borrowed).
    public boolean isAvailable() {
        return !isBorrowed;
    }

    // Getter method to retrieve the book's title.
    public String getTitle() {
        return title;
    }

    // Setter method to edit the book's title.
    public void setTitle(String title) {
        this.title = title;
        LOGGER.info(() -> "Book title has been updated to: " + title);
    }

    // Getter method to retrieve the book's author.
    public String getAuthor() {
        return author;
    }

    // Getter method to check if the book is borrowed.
    public boolean isBorrowed() {
        return isBorrowed;
    }

    // Method to display the book's details.
    public void displayDetails() {
        LOGGER.info(() -> "Title: " + title + ", Author: " + author);
    }
}