package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    // Methods and properties for BookRepository can be added here
    public String getRepositoryName() {
        return "BookRepository";
    }

    public void doSomething() {
        // Simple implementation
        System.out.println("BookRepository is doing something.");
    }
}
