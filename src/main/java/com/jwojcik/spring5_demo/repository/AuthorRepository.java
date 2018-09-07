package com.jwojcik.spring5_demo.repository;

import com.jwojcik.spring5_demo.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * @author jrwoj
 * createdOn 07.09.2018
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
