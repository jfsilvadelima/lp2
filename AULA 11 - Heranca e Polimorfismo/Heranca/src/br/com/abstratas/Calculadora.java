/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.abstratas;

/**
 *
 * @author fjrda
 */

// 1ª Classe concreta deve implementar os métodos abstratos da classe abstrata
public class Calculadora extends OperacaoMatematica{

    @Override
    double multiplicacao(double x, double y) {
        setResultado(x * y);
        return getResultado();
    }

    @Override
    double soma(double x, double y) {
        setResultado(x+y);
        return getResultado();
    }

    @Override
    double divisao(double x, double y) {
        setResultado(x/y);
        return getResultado();
    }

    @Override
    double subtracao(double x, double y) {
        setResultado(x-y);
        return getResultado();
    }
       
    
}
