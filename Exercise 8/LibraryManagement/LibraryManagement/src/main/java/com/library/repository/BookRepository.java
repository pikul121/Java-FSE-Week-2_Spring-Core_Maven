package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

    public void doSomething() {
        System.out.println("Book repository is doing something");
    }
}
