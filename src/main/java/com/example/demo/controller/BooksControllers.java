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

    @DeleteMapping(value = "/{bId}")
    public String deleteBook(@PathVariable Integer bId) {
        System.out.println("book delete..." + bId);
        return "Method: book delete - deleteMapping";
    }
}
