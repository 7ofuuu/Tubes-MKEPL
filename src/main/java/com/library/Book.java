package com.library;

public class Book {

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
            System.out.println("Book is successfully borrowed: " + title);
        } else {
            System.out.println("Sorry, this book is already borrowed");
        }
    }

    // Method to return a book.
    public void returnBook() {
        // To check if the book is already borrowed.
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("You've successfully returned the book: " + title);
        } else {
            // If the book wasn't borrowed, display a message.
            System.out.println("This book wasn't borrowed");
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
        System.out.println("Title: " + title + ", Author: " + author);
    }
}