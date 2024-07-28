package edu.cibertec.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/main")
public class MainController {
    @GetMapping
    public String index() {
        return "Hola mundo desde spring boot en azure";
    }
}
