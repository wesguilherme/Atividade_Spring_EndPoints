package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ManipulaStringEndPoints {

    @GetMapping("/inverte")

    public String inverteString(@RequestParam String nome) {
        String t = new StringBuilder(nome).reverse().toString();
        return t;
    }

    @GetMapping("/palindromo")

    public String palindromo(@RequestParam String nome) {
        String nomet = nome.replaceAll("\\s+", "");
        String t = new StringBuilder(nomet).reverse().toString();
        if (nomet.equalsIgnoreCase(t)) {
            return "É palíndromo";
        } else {
            return "Não é palíndromo";
        }
    }
}
