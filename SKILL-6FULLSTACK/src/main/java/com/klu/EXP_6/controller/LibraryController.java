package com.klu.EXP_6.controller;

import com.klu.EXP_6model.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

    private List<Book> bookList = new ArrayList<>();

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Online Library System";
    }

    @GetMapping("/count")
    public int totalBooks() {
        return 10;
    }

    @GetMapping("/price")
    public double bookPrice() {
        return 499.99;
    }

    @GetMapping("/books")
    public List<String> getBooks() {
        return Arrays.asList("Java", "Spring", "DSA", "Microservices");
    }

    @GetMapping("/books/{id}")
    public String getBookById(@PathVariable int id) {
        return "Details of Book ID: " + id;
    }

    @GetMapping("/search")
    public String searchBook(@RequestParam String title) {
        return "Searching for book: " + title;
    }

    @GetMapping("/author/{name}")
    public String getAuthor(@PathVariable String name) {
        return "Books written by: " + name;
    }

    @PostMapping("/addbook")
    public String addBook(@RequestBody Book book) {
        bookList.add(book);
        return "Book added successfully";
    }

    @GetMapping("/viewbooks")
    public List<Book> viewBooks() {
        return bookList;
    }
}
