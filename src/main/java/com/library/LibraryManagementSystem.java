package com.library;


import java.util.Scanner;
import java.util.logging.Logger;

public class LibraryManagementSystem {

    private static final Logger LOGGER = Logger.getLogger(LibraryManagementSystem.class.getName());

    public static void main(String[] args){
        // Create a scanner object for user input.
        Scanner scanner = new Scanner(System.in);

        // Create a Library object to manage the collection of the books. 
        Library library = new Library();

        // Add some books to the Library's collection.
        library.addBook(new Book("Verity", "Colleen Hoover"));
        library.addBook(new Book("The Secret", "Rhonda Byrne"));
        library.addBook(new Book("Grit", "Angela Duckworth"));
        library.addBook(new Book("book1", "Colleen Hoover"));
        library.addBook(new Book("Dune", "Rhonda Byrne"));
        library.addBook(new Book("book2", "Angela Duckworth"));
        library.addBook(new Book("book3", "Colleen Hoover"));
        library.addBook(new Book("book4", "Rhonda Byrne"));
        library.addBook(new Book("book5", "Angela Duckworth"));
        library.addBook(new Book("book1", "Colleen Hoover"));
        library.addBook(new Book("Dune", "Rhonda Byrne"));
        library.addBook(new Book("book2", "Angela Duckworth"));
        library.addBook(new Book("book3", "Colleen Hoover"));
        library.addBook(new Book("book4", "Rhonda Byrne"));
        library.addBook(new Book("book5", "Angela Duckworth"));
        library.addBook(new Book("book1", "Colleen Hoover"));
        library.addBook(new Book("Dune", "Rhonda Byrne"));
        library.addBook(new Book("book2", "Angela Duckworth"));
        library.addBook(new Book("book3", "Colleen Hoover"));
        library.addBook(new Book("book4", "Rhonda Byrne"));
        library.addBook(new Book("book5", "Angela Duckworth"));


        // Infinite loop to keep the system running until the user chooses to exit.
        while(true) {
            // Display the available books in the Library.
            LOGGER.info("\nAvailable Books: ");
            library.displayAvailableBooks();

            // Prompt the user for an action: borrow, return, or exit.
            LOGGER.info("\nDo you want to borrow or return a book?");
            LOGGER.info("Type 'borrow' to borrow a book, 'return' to return a book, or 'exit' to quit.");
            String action = scanner.nextLine().toLowerCase(); // Read the userinput and convert it into lower case.

            // Check if the user wants to borrow a book.
            if(action.equalsIgnoreCase("Borrow")){
                // Get the title and author of the book to be borrowed.
                LOGGER.info("Enter the title of the book you want to borrow: ");
                String borrowTitle = scanner.nextLine();
                LOGGER.info("Enter the author of the book you want to borrow: ");
                String borrowAuthor = scanner.nextLine();
                // Borrow the specified book from the Library.
                library.borrowBook(borrowTitle, borrowAuthor);
               
            } // Check if the user wants to return a book.
            else if(action.equalsIgnoreCase("Return")){
                // Get the title and author of the book to return.
                LOGGER.info("Enter the title of the book you want to return: ");
                String returnTitle = scanner.nextLine();
                LOGGER.info("Enter the author of the book you want to return: ");
                String returnAuthor = scanner.nextLine();
                // Return the specified bookt o the Library.
                library.returnBook(returnTitle, returnAuthor);

            } // Check if the user wants to exit the system.
             else if (action.equalsIgnoreCase("exit")) {
                    // Exit condition
                    LOGGER.info("Exiting the system. Goodbye!");
                    break;
            } // Handle inavlid input from the user. 
             else {
                LOGGER.info("Invalid option. Please enter 'borrow', 'return', or 'exit'.");
        }

    } // Close the scanner to prevent resource leaks.
    scanner.close();
 
  }
  
}

       

           
 
 