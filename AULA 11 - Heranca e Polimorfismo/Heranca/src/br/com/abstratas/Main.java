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
public class Main {
    
    public static void main(String[] args) {
        System.out.println(new Calculadora().divisao(10, 5));
        System.out.println(new Calculadora().multiplicacao(10, 5));
        System.out.println(new Calculadora().soma(10, 5));
        System.out.println(new Calculadora().subtracao(10, 5));        
       
    }
}
