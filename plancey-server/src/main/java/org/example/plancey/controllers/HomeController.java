package org.example.plancey.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;


@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping








    public String helloWorld() {
        return "Hello World";
    }

}
