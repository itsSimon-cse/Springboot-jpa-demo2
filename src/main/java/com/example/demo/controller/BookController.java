package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/get/{bookID}")
    public Book getBook(@PathVariable String bookID) {
        return bookService.getBook(bookID);
    }

    @PostMapping("/createBook")
    public Book createBook(@RequestBody Book book) {
        return bookService.create(book);
    }

    @PostMapping("/addCategory/{category}")
    public Book addCategory(@RequestBody Book book, @PathVariable String category) {
        return bookService.addCategory(book, category);
    }

    @GetMapping("/getByCategory/{category}")
    public List<Book> getBooksByCategory(@PathVariable String category) {
        return bookService.getBooksByCategory(category);
    }

    @DeleteMapping("/deleteBook/{bookId}")
    public String deleteBook(@PathVariable String bookId) {
        bookService.delete(bookId);
        return "Book Deleted";
    }

    @PutMapping("/updateBook/{bookId}")
    public Book updateBook(@RequestBody Book book, @PathVariable String bookId) {
        return bookService.update(book, bookId);
    }

    @DeleteMapping("/deleteAll")
    public String deleteBooks() {
        bookService.deleteAll();
        return "All Books data deleted";
    }
}
