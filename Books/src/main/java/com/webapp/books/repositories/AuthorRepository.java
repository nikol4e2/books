package com.webapp.books.repositories;

import com.webapp.books.domain.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
