package com.webapp.books.controllers;

import com.webapp.books.domain.Author;
import com.webapp.books.domain.dto.AuthorDto;
import com.webapp.books.mappers.Mapper;
import com.webapp.books.services.AuthorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {

    private AuthorService authorService;

    private Mapper<Author, AuthorDto> authorMapper;


    public AuthorController(AuthorService authorService, Mapper<Author, AuthorDto> authorMapper) {
        this.authorService = authorService;
        this.authorMapper = authorMapper;
    }

    @PostMapping(path = "/authors")
    public AuthorDto createAuthor(@RequestBody AuthorDto authorDto) {
        Author author= authorMapper.mapFrom(authorDto);
        Author savedAuthorEntity=authorService.createAuthor(author);
        return authorMapper.mapTo(savedAuthorEntity);
    }
}
