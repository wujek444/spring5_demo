package com.jwojcik.spring5_demo.repository;

import com.jwojcik.spring5_demo.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * @author jrwoj
 * createdOn 07.09.2018
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
