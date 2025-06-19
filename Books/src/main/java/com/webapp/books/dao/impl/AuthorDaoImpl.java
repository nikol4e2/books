package com.webapp.books.dao.impl;

import com.webapp.books.dao.AuthorDao;
import com.webapp.books.domain.Author;
import org.springframework.jdbc.core.JdbcTemplate;

public class AuthorDaoImpl implements AuthorDao {

    private final JdbcTemplate jdbcTemplate;


    public AuthorDaoImpl(final JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void create(Author author) {
        jdbcTemplate.update("INSERT INTO authors (id, name, age) VALUES (?, ?, ?)",author.getId(),author.getName(),author.getAge());
    }
}
