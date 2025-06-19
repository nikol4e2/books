package com.webapp.books.mappers.impl;

import com.webapp.books.domain.Book;
import com.webapp.books.domain.dto.BookDto;
import com.webapp.books.mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;


@Component
public class BookMapper implements Mapper<Book, BookDto> {


    private ModelMapper modelMapper;

    public BookMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public BookDto mapTo(Book book) {
        return modelMapper.map(book, BookDto.class);
    }

    @Override
    public Book mapFrom(BookDto bookDto) {
        return modelMapper.map(bookDto, Book.class);
    }
}
