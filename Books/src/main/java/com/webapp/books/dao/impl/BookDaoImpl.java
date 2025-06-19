package com.webapp.books.dao.impl;

import com.webapp.books.dao.BookDao;
import com.webapp.books.domain.Book;
import org.springframework.jdbc.core.JdbcTemplate;

public class BookDaoImpl implements BookDao {
    private final JdbcTemplate jdbcTemplate;

    public BookDaoImpl(final JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void create(Book book) {
        this.jdbcTemplate.update("INSERT INTO books (isbn, title, author_id) VALUES (?, ?, ?)",book.getIsbn(),book.getTitle(),book.getAuthorId());
    }
}
