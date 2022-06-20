package com.calculadora.project.calculadora;

import com.calculadora.project.calculadora.operacoes.*;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    private final Calculadora calc = new Calculadora();

    private Operacao op;

    public Double Adicionar(Double num1, Double num2) {
        op = new Adicao();
        return calc.realizarCalculo(op, num1, num2);
    }

    public Double Subtrair(Double num1, Double num2) {
        op = new Subtracao();
        return calc.realizarCalculo(op, num1, num2);
    }

    public Double Dividir(Double num1, Double num2) {
        op = new Divisao();
        return calc.realizarCalculo(op, num1, num2);
    }

    public Double Multiplicar(Double num1, Double num2) {
        op = new Multiplicacao();
        return calc.realizarCalculo(op, num1, num2);
    }
}
