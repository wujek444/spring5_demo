package com.jwojcik.spring5_demo.repository;

import com.jwojcik.spring5_demo.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * @author jrwoj
 * createdOn 10.09.2018
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
