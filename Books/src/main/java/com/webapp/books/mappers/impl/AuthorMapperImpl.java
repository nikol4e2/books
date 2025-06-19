package com.webapp.books.mappers.impl;

import com.webapp.books.domain.Author;
import com.webapp.books.domain.dto.AuthorDto;
import com.webapp.books.mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;


@Component
public class AuthorMapperImpl implements Mapper<Author, AuthorDto> {


    private ModelMapper modelMapper = new ModelMapper();

    public AuthorMapperImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }


    @Override
    public AuthorDto mapTo(Author author) {
        return modelMapper.map(author, AuthorDto.class);
    }

    @Override
    public Author mapFrom(AuthorDto authorDto) {
        return modelMapper.map(authorDto, Author.class);
    }
}
