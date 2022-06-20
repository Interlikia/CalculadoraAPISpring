package com.calculadora.project.calculadora.operacoes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.security.InvalidParameterException;

@Getter
@Setter
@AllArgsConstructor
public class Divisao implements Operacao {
    @Override
    public Double calcular(double num1, double num2) {
        if (num2 == 0) {
            throw new InvalidParameterException("O DIVISOR NÃO PODE SER 0 (ZERO) !");
        }
        return num1 / num2;
    }
}

