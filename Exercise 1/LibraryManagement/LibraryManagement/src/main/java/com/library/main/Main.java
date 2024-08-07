package com.library.main;
import com.library.service.BookService;
import org.springframework.context.*;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) context.getBean("bookService");
        bookService.performService();
    }
}
