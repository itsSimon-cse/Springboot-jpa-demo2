package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBook(String bookID) {
        return bookRepository.findById(bookID).orElse(null);
    }

    public Book create(Book book) {
        return bookRepository.save(book);
    }

    public void delete(String bookId) {
        bookRepository.deleteById(bookId);
    }

  
    
    public Book update(Book book, String bookId) {
        Book existingBook = bookRepository.findById(bookId).orElse(null);

        if (existingBook != null) {
            existingBook.setAuthor(book.getAuthor());
            existingBook.setPublisher(book.getPublisher());
            existingBook.setCategory(book.getCategory());  
            bookRepository.save(existingBook);
            return existingBook;
        } else {
           
            return null;
        }
    }


    public Book addCategory(Book book, String category) {
        book.setCategory(category);
        return bookRepository.save(book);
    }

    public List<Book> getBooksByCategory(String category) {
        return bookRepository.findByCategory(category);
    }

    public void deleteAll() {
        bookRepository.deleteAll();
    }
}
