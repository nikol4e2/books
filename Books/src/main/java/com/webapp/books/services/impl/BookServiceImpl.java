package com.webapp.books.services.impl;


import com.webapp.books.domain.Book;
import com.webapp.books.domain.dto.BookDto;
import com.webapp.books.repositories.BookRepository;
import com.webapp.books.services.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private  final BookRepository bookRepository;


    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book createBook(String isbn, Book book) {
        book.setIsbn(isbn);
        return bookRepository.save(book);
    }
}
