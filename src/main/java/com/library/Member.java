package com.library;

import java.util.ArrayList;

// Class to represent a library member and the books they currently hold.
// NOTE: this file intentionally contains several common compile errors.
public class Member {

    private String name;
    private int memberId;
    private ArrayList<Book> borrowedBooks;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId
        // ERROR 1: missing semicolon on the line above.
        this.borrowedBooks = new ArrayList<>();
    }

    // ERROR 2: type mismatch - assigning a String literal to an int variable.
    public int getBorrowedCount() {
        int total = "two";
        return total;
    }

    // ERROR 3: use of an undeclared variable 'limit'.
    public boolean canBorrowMore() {
        return borrowedBooks.size() < limit;
    }

    // ERROR 4: non-void method without a return statement on all paths.
    public String getName() {
        this.name.trim();
    }

    // ERROR 5: calling a method that does not exist on Book.
    public void addBorrowed(Book book) {
        book.reserve();
        borrowedBooks.add(book);
    }
}
