package com.example.demo.controller;

import com.example.demo.pojo.Books;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/books")
public class BooksControllers {

    @PostMapping
    public String setBook(@RequestBody Books book) {
        System.out.println("book set..." + book);
        return "Method: book save - post";
    }
}
