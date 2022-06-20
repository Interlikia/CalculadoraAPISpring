package com.calculadora.project.calculadora.operacoes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Adicao implements Operacao {
    @Override
    public Double calcular(double num1, double num2) {
        return num1 + num2;
    }
}
