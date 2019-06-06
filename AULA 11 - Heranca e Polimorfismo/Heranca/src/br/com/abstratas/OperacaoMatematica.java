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

// Classe abstrata não pode ser instanciada
public abstract class OperacaoMatematica {
    private double resultado;
    
    // Metodos abstratos não tem corpo
    abstract double multiplicacao(double x, double y);
    abstract double soma(double x, double y);
    abstract double divisao(double x, double y);
    abstract double subtracao(double x, double y);

    //Métodos tradicionais
    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }   
    
}
