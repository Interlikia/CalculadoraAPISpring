package com.calculadora.project.calculadora;

import com.calculadora.project.calculadora.operacoes.Operacao;

import java.security.InvalidParameterException;

public class Calculadora {

    public Double realizarCalculo(Operacao operacao, Double num1, Double num2) {
        if (operacao == null)
            throw new InvalidParameterException("Operacao invalida");

        return operacao.calcular(num1, num2);
    }

}
