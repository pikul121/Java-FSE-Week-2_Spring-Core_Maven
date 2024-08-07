package com.example.service;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.librarymanagement.entity.Book;
import com.example.librarymanagement.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(BookService.class);

    public java.util.List<Book> findAll() {
        java.util.List<Book> books = bookRepository.findAll();
        logger.info("Books retrieved: " + books);
        return books;
    }
}

