package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PalindromoEndPoints {

    @GetMapping("/palindromo")

    public String palíndromo(String nome) {
        String nomet = nome.replaceAll("\\s+", "");
        String t = new StringBuilder(nomet).reverse().toString();
        if (nomet.equalsIgnoreCase(t)) {
            return "É palíndromo";
        } else {
            return "Não é palíndromo";
        }
    }
}
