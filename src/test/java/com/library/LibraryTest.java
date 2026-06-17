package com.library;

public class LibraryTest {
    public static void main(String[] args) {
        System.out.println("Memulai Automasi Pengujian Java Assertion...");
        testAddBook();
        
    }

    public static void testAddBook() {
        Library library = new Library();
        Book book = new Book("Verity", "Colleen Hoover");
        library.addBook(book);
        boolean statusBuku = book.isAvailable();
        assert book != null : "ERROR: Objek buku gagal dibuat!";
        assert book.getTitle().equals("Verity") : "ERROR: Judul buku tidak cocok!";
        System.out.println("[PASSED] testAddBook");
    }
}
