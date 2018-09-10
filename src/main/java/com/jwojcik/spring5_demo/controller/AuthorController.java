package com.jwojcik.spring5_demo.controller;

import com.jwojcik.spring5_demo.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jrwoj
 * createdOn 10.09.2018
 */

@Controller
public class AuthorController {

    @Autowired
    AuthorRepository authorRepository;

    @RequestMapping(value = "/authors")
    public String getAuthors(Model model){
        model.addAttribute("authors", authorRepository.findAll());

        return "authors";
    }
}
