package com.webapp.books.services.impl;

import com.webapp.books.domain.Author;
import com.webapp.books.repositories.AuthorRepository;
import com.webapp.books.services.AuthorService;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {


    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


    @Override
    public Author createAuthor(Author author) {
       return this.authorRepository.save(author);

    }
}
