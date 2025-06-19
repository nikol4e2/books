package com.webapp.books.dao;

import com.webapp.books.dao.impl.BookDaoImpl;
import com.webapp.books.domain.Book;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class BookDaoImplTests {

    @Mock
    private JdbcTemplate jdbcTemplate;

    @InjectMocks
    private BookDaoImpl underTest;

    @Test
    public void testThatCreateBookGeneratesCorrectSql()
    {
        Book book = Book.builder()
                .isbn("229-222")
                .title("TITLE")
                .authorId(1L)
                .build();


        underTest.create(book);


        verify(jdbcTemplate).update(eq("INSERT INTO books (isbn, title, author_id) VALUES (?, ?, ?)"),
                eq("229-222"),
                eq("TITLE"),
                eq(1L)
        );
    }
}
