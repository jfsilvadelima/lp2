/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.polimorfismo;

/**
 *
 * @author fjrda
 */
public class Main {
    
    // Método que mostra o calculo
    static void calcule (ContaMatematica cm, double x, double y){
        System.out.println(cm.operacao(x, y));
    }
    
    public static void main(String[] args) {
        
        // Cada operação tem uma forma diferente
        calcule(new Multiplicacao(), 10, 5);
        calcule(new Divisao(), 10, 5);
        calcule(new Soma(), 10, 5);
        calcule(new Subtracao(), 10, 5);
    }
}
