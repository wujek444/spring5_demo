package com.jwojcik.spring5_demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class BaseController {

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name", required = false) String name){
        return "Hello " + (name == null ? "unknown" : name) + "!";
    }

}
