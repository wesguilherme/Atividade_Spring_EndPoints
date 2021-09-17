package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Retangulo {

    @GetMapping("/area")

    public String calculaArea(double ladoA, double ladoB) {
        Double areaTotal = ladoA * ladoB;
        return "A área do retangulo é: " + areaTotal + " metros quadrados";
    }

    @GetMapping("/perimetro")

    public String calculaPerimetro(double ladoA, double ladoB) {
        Double perimetro = ladoA + ladoA + ladoB + ladoB;
        return "O perímetro do retangulo é: " + perimetro + " metros";
    }

    @GetMapping("/piso")

    public String quantidadePiso(double areaLajota, double areaTotal) {
        Double piso = areaTotal / areaLajota;
        return "A quantidade de piso necessária é de " + piso + " unidades";
    }

    @GetMapping("/rodape")

    public String quantidadeRodape(double comprimentoLajota, double perimetro) {
        Double rodape = perimetro / comprimentoLajota;
        return "A quantidade de rodapé necessária é de " + rodape + " unidades";
    }
}
