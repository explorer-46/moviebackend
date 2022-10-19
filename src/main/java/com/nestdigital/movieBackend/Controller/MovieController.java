package com.nestdigital.movieBackend.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @PostMapping("/movieview")
    public String Movie(){
        return "test";

    }
}
