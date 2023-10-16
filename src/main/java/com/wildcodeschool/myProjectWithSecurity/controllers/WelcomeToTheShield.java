package com.wildcodeschool.myProjectWithSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeToTheShield {

    @GetMapping("/")
    public String welcome(){
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String avengers(){
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    public String director(){
        return "Campus WildCodeSchool: Bordeaux, Lyon, Nantes,Lille, Paris, Toulouse";
    }

}
