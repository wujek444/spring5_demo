package com.jwojcik.spring5_demo.bootstrap;

import com.jwojcik.spring5_demo.model.Author;
import com.jwojcik.spring5_demo.model.Book;
import com.jwojcik.spring5_demo.model.Publisher;
import com.jwojcik.spring5_demo.repository.AuthorRepository;
import com.jwojcik.spring5_demo.repository.BookRepository;
import com.jwojcik.spring5_demo.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author jrwoj
 * createdOn 10.09.2018
 */

@Component
public class InitData implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private PublisherRepository publisherRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){
        //Eric:
        Author eric = new Author("Eric", "Evans");
        Publisher publisher1 = new Publisher("Harper Collins", "Elm St.");
        publisherRepository.save(publisher1);

        Book book1 = new Book("Domain Driven Design", "1234", publisher1);
        bookRepository.save(book1);

        eric.getBooks().add(book1);
        authorRepository.save(eric);

        //Rod:
        Author rod = new Author("Rod", "Johnson");
        Publisher publisher2 = new Publisher("Wors", "123 St.");
        publisherRepository.save(publisher2);

        Book book2 = new Book("J2EE Development without EJB", "2344", publisher2);
        bookRepository.save(book2);

        rod.getBooks().add(book2);
        authorRepository.save(rod);

    }
}
