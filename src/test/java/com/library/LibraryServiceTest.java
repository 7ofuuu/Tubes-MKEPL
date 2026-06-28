package com.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Additional tests for borrow/return flow and input edge cases.
public class LibraryServiceTest {

    // FAIL CAUSE 1: regression - after returning, the book should be available again.
    // Production code now keeps isBorrowed = true, so this assertion fails.
    @Test
    public void testReturnedBookBecomesAvailable() {
        Book book = new Book("Grit", "Angela Duckworth");
        book.borrowBook();
        book.returnBook();
        assertTrue(book.isAvailable());
    }

    // FAIL CAUSE 2: unhandled null input - getTitle() is null so equalsIgnoreCase throws NPE.
    @Test
    public void testBorrowBookWithNullTitle() {
        Library library = new Library();
        library.addBook(new Book(null, null));
        library.borrowBook("Verity", "Colleen Hoover");
        assertTrue(true);
    }

    // FAIL CAUSE 3: wrong expected value - author is asserted incorrectly.
    @Test
    public void testBookAuthorIsStored() {
        Book book = new Book("The Secret", "Rhonda Byrne");
        assertEquals("Unknown Author", book.getAuthor());
    }
}
