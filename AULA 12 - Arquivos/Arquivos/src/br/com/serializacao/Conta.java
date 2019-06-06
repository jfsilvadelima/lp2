/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.serializacao;

import java.io.Serializable;


/**
 *
 * @author fjrda
 */
public class Conta implements Serializable{
    private String cliente;
    private double saldo;
    private int nunemroConta;

    public Conta(String cliente, double saldo, int nunemroConta) {
        this.cliente = cliente;
        this.saldo = saldo;
        this.nunemroConta = nunemroConta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNunemroConta() {
        return nunemroConta;
    }

    public void setNunemroConta(int nunemroConta) {
        this.nunemroConta = nunemroConta;
    }
    
    
}
