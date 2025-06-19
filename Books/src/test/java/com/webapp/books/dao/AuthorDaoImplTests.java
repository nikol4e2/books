package com.webapp.books.dao;

import com.webapp.books.dao.impl.AuthorDaoImpl;
import com.webapp.books.domain.Author;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;


@ExtendWith(MockitoExtension.class)
public class AuthorDaoImplTests {


    @Mock
    private JdbcTemplate jdbcTemplate;

    @InjectMocks
    private AuthorDaoImpl underTest;


    @Test
    public void testThatCreateAuthorCreatesCorrectSql()
    {
        Author author = Author.builder()
        .id(1L)
                .name("Author 1")
                .age(20)

        .build();
        underTest.create(author);
        verify(jdbcTemplate).update(eq("INSERT INTO authors (id, name, age) VALUES (?, ?, ?)"),
                eq(1L), eq("Author 1"), eq(20)
                );


    }


}
