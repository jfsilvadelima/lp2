/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.interfaces;

/**
 *
 * @author fjrda
 */
public class Calculadora implements Multiplicacao, Divisao, Adicao, Subtracao{

    @Override
    public double multiplicacao(double x, double y){ 
       return x*y;
    }

    @Override
    public double divisao(double x, double y) {
        return x/y;
    }

    @Override
    public double adicao(double x, double y) {
        return x+y;
    }

    @Override
    public double subtracao(double x, double y) {
        return x-y;
    }

    
    
}
