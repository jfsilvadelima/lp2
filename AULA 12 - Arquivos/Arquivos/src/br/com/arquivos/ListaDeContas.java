/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.arquivos;

import java.util.ArrayList;

/**
 *
 * @author fjrda
 */
public class ListaDeContas {
    
    // Retorna uma lista de contas
    public ArrayList<Conta> listaDeContas(){
        ArrayList contas = new ArrayList();
        
        contas.add(new Conta("Sebastião da Silva", 5432.87, 123));
        contas.add(new Conta("Antonio Pereira", 542.87, 124));
        contas.add(new Conta("Silva Lima", 34532.87, 125));
        contas.add(new Conta("Beto Barbosa", 5452.87, 126));
        return contas;
    }
}
