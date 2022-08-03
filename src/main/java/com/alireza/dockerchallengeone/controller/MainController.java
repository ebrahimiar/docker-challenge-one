package com.alireza.dockerchallengeone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MainController {

    @GetMapping("/helloworld")
    public String helloWorld(@RequestParam(required = false) String name) {
        if (name != null) {
            return "Hello " + name;
        }
        return "Hello Stranger";
    }

    @GetMapping("/author")
    public String getAuthor() {
        return "Alireza Ebrahimi";
    }
}
