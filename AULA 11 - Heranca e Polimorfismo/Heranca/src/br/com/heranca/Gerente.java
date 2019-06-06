/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.heranca;

/**
 *
 * @author fjrda
 */
public class Gerente extends Funcionario{
    protected String gerencia;
    
    public Gerente(){
        super("Tereza", 47653.87, 'F', new Endereco());
    }
    
    public String exibir(){
        return "";
    }
        
}
