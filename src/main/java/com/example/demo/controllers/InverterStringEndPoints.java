package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class InverterStringEndPoints {

    @GetMapping("/inverte")

    public static void inverteString(String nome) {
        String t = new StringBuilder(nome).reverse().toString();
        System.out.println(t);
        ;
    }
}
