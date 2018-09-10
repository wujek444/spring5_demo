package com.jwojcik.spring5_demo.controller;

import com.jwojcik.spring5_demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jrwoj
 * createdOn 10.09.2018
 */

@Controller
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @RequestMapping(value = "/books")
    public String getBooks(Model model){
        model.addAttribute("books", bookRepository.findAll());

        //thymeleaf template
        return "books";
    }
}
