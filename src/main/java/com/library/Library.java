package com.library;


import java.util.ArrayList;
import java.util.logging.Logger;

public class Library{
    private static final Logger LOGGER = Logger.getLogger(Library.class.getName());
    private static final String BY = " by ";

    // Private member variable to store a list of the books in the Library.
    private ArrayList<Book> books;

    // Constructor to initialize the ArrayList of books.
    public Library() {
        this.books = new ArrayList<Book>();
    }

    // Method to add a book in the Library's collection.
    public void addBook(Book book) {
        books.add(book);

    }
    
    // Method to display all the available (not borrowed) books in the library.
    public void displayAvailableBooks(){
        // Iterate through the list of books.
        for(Book book : books){
            // Checking the availability of the book.
            if(book.isAvailable()){
                // Display the title and author of the available books.
                LOGGER.info(book.getTitle() + BY + book.getAuthor());
            }
        }
    }

    // Method to borrow a book.
    public void borrowBook(String title, String author){
        // Iterate through the list of books.
        for(Book book : books){
            // To check if the book's title and author matches the input and if its available.
            if(book.getTitle().equalsIgnoreCase(title) && book.getAuthor().equalsIgnoreCase(author) && book.isAvailable()){
                if(book.isAvailable()){
                    // If the book is available, borrow it.
                    book.borrowBook();
                    LOGGER.info("You have successfully borrowed '" + title + "'" + BY + author + ".");
                }  else {
                    LOGGER.info("Sorry, '" + title + "'" + BY + author + " is already borrowed.");
                }
                return; // Exit the method after borrowing.
            }
        }
          // If the book is not found or available display a message.
          LOGGER.info("Sorry, the book is not available!");
    }
    
    // Method to return a book.
    public void returnBook(String title, String author){
        // Iterate through the list of books.
        for(Book book : books){
            // Check if the book's itle and author mathes to the input and if its currently borrowed.
            if(book.getTitle().equalsIgnoreCase(title) && book.getAuthor().equalsIgnoreCase(author) && book.isBorrowed()){
                // If the book is borrowed, return it.
                if (!book.isAvailable()) {
                    book.returnBook();  // Mark the book as returned
                    LOGGER.info("You have successfully returned '" + title + "'" + BY + author + ".");
                }
                return; // Exit the method after returning.
            }
         }
         // If the book was not found pr wasn't borrowed, display a message.
         LOGGER.info("This book wasn't borrowed from the Library!");
     }
    
}

    
        