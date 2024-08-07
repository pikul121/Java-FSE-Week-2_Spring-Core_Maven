package com.example.librarymanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public String getBooks() {
        return "List of books";
    }
    public class HomeController {

        @GetMapping("/")
        public String home() {
            return "Welcome to the Library Management System";
        }
        
    }
}
