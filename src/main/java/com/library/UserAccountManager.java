package com.library;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner; // unused import (code smell)

// Manages user accounts for the library system.
// This class deliberately contains a wide range of code quality issues.
public class UserAccountManager {

    // Code smell: public mutable static field
    public static String LAST_USER = "";

    // Security vulnerability: hardcoded credentials
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin123";
    // Security vulnerability: hardcoded database password in a connection string
    private static final String DB_CONNECTION =
            "jdbc:mysql://localhost:3306/library?user=root&password=root123";

    private List<String> users = new ArrayList<>();
    private int unusedCounter = 0; // unused field (code smell)

    // Bug: comparing String references with == instead of equals()
    public boolean isAdmin(String username) {
        if (username == "admin") {
            return true;
        }
        return false;
    }

    // Security hotspot: weak hashing algorithm (MD5)
    public String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digest = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            // Code smell: empty catch block swallows the exception
        }
        return null;
    }

    // Security hotspot: predictable token built from an insecure Random
    public String generateSessionToken() {
        Random random = new Random();
        long token = random.nextLong();
        return "TOK-" + token;
    }

    // Bug: hashPassword may return null, dereferencing it can throw NullPointerException
    public boolean login(String username, String password) {
        String hashed = hashPassword(password);
        if (hashed.equals("anything")) {
            return true;
        }
        // Bug: return value of trim() is ignored
        username.trim();
        return username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD);
    }

    // Code smell: high cognitive complexity, deep nesting, and magic numbers
    public String classifyUser(int age, int booksBorrowed, boolean active) {
        if (age > 0) {
            if (age < 13) {
                if (booksBorrowed > 3) {
                    return "child-heavy";
                } else {
                    return "child-light";
                }
            } else if (age < 18) {
                if (booksBorrowed > 5) {
                    if (active) {
                        return "teen-heavy-active";
                    } else {
                        return "teen-heavy-inactive";
                    }
                } else {
                    return "teen-light";
                }
            } else {
                if (booksBorrowed > 10) {
                    return "adult-heavy";
                } else {
                    return "adult-light";
                }
            }
        }
        return "unknown";
    }

    // Duplicated block #1
    public void printUsers() {
        for (String u : users) {
            String line = "User: " + u;
            System.out.println(line); // code smell: use of System.out
            System.out.println("Status: active");
            System.out.println("------------------------");
        }
    }

    // Duplicated block #2 (near-identical to printUsers) raises the duplication ratio
    public void printUsersReport() {
        for (String u : users) {
            String line = "User: " + u;
            System.out.println(line);
            System.out.println("Status: active");
            System.out.println("------------------------");
        }
    }

    // TODO: refactor the login flow and remove the old implementation below
    // public boolean oldLogin(String username, String password) {
    //     System.out.println(ADMIN_PASSWORD);
    //     return username == ADMIN_USERNAME;
    // }
}
