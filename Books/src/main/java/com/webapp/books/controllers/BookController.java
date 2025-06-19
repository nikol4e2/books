package com.webapp.books.controllers;


import com.webapp.books.domain.Book;
import com.webapp.books.domain.dto.BookDto;
import com.webapp.books.mappers.Mapper;
import com.webapp.books.services.BookService;
import lombok.extern.java.Log;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class BookController {

    private Mapper<Book,BookDto> bookMapper;
    private BookService bookService;

    public BookController(Mapper<Book, BookDto> bookMapper, BookService bookService) {
        this.bookMapper = bookMapper;
        this.bookService = bookService;
    }

    @PutMapping("/books/{isbn}")
    public ResponseEntity<BookDto> createBook(@PathVariable String isbn, @RequestBody BookDto bookDto) {

    Book book=bookMapper.mapFrom(bookDto);
    Book savedBook=bookService.createBook(isbn,book);
    return new ResponseEntity<>(bookMapper.mapTo(savedBook), HttpStatus.CREATED);


    }


}
