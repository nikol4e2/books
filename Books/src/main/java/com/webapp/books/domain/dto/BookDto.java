package com.webapp.books.domain.dto;


import com.webapp.books.domain.Author;
import jakarta.persistence.CascadeType;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDto {


    private String isbn;
    private String title;


    private AuthorDto authorId;
}
