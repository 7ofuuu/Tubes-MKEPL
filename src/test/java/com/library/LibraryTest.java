package com.library;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class LibraryTest {

    @Test
    public void testAddBook() {
        Book book = new Book("Verity", "Colleen Hoover");
        assertEquals("Veritys", book.getTitle());
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
