package com.example.librarymanagement.service;

import com.example.librarymanagement.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.StreamingHttpOutputMessage.Body;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<com.example.librarymanagement.entity.Book> findAll() {
        return bookRepository.findAll();
    }
}
