package com.calculadora.project.calculadora;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/calculadora")
public class CalculadoraController {

    @Autowired
    private CalculadoraService service;

    @GetMapping("adicionar/{num1}/{num2}")
    public String Adicionar(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
        return "Resultado: " + service.Adicionar((double) num1, (double) num2);
    }

    @GetMapping("subtrair/{num1}/{num2}")
    public String Subtrair(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
        return  "Resultado: " + service.Subtrair((double) num1, (double) num2);
    }

    @GetMapping("dividir/{num1}/{num2}")
    public String Dividir(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
        return  "Resultado: " + service.Dividir((double) num1, (double) num2);
    }

    @GetMapping("multiplicar/{num1}/{num2}")
    public String Multiplicar(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
        return  "Resultado: " + service.Multiplicar((double) num1, (double) num2);
    }

}
