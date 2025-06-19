package com.webapp.books.services;

import com.webapp.books.domain.Book;
import com.webapp.books.domain.dto.BookDto;

public interface BookService {


    Book createBook(String isbn,Book book);
}
