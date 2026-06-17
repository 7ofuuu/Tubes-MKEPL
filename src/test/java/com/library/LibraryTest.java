package com.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    public void testAddBook() {
        Book book = new Book("Verity", "Colleen Hoover");
        assertEquals("Verity", book.getTitle());
        assertEquals("Colleen Hoover", book.getAuthor());
    }

    @Test
    public void testNewBookIsAvailable() {
        Book book = new Book("Grit", "Angela Duckworth");
        assertTrue(book.isAvailable());
        assertFalse(book.isBorrowed());
    }

    @Test
    public void testBorrowBook() {
        Book book = new Book("The Secret", "Rhonda Byrne");
        book.borrowBook();
        assertTrue(book.isBorrowed());
        assertFalse(book.isAvailable());
    }

    @Test
    public void testReturnBook() {
        Book book = new Book("The Secret", "Rhonda Byrne");
        book.borrowBook();
        book.returnBook();
        assertFalse(book.isBorrowed());
        assertTrue(book.isAvailable());
    }
}
