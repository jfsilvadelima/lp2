/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.serializacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author fjrda
 */
public class GraverLerArquivo {
    private String caminho = "C:/Users/fjrda/Documents/NetBeansProjects/Arquivos/contaSerial.byte";
        
    public void gravar(){
        try(FileOutputStream fos = new FileOutputStream(caminho)){
            try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
                // Metodo para escrever no arquivo
                oos.writeObject(new ListaDeContas().listaDeContas());
            }
        }catch(IOException e){
            e.getMessage();
        }      
        
    }
    
    
    
    public ArrayList<Conta> ler(){
        ArrayList contas = new ArrayList();
        
        try(FileInputStream fis = new FileInputStream(caminho)){
            try(ObjectInputStream ois = new ObjectInputStream(fis)){
                // Metodo para ler do arquivo
             contas =  (ArrayList<Conta>)ois.readObject();
            }
        }catch(IOException | ClassNotFoundException e){
            e.getMessage();
        }    
        
        return contas;
    }
    
    public void mostrar(){
        for (Conta c : ler()) {
            System.out.println("Cliente.: "+c.getCliente()+", "
                    + "Conta.: "+c.getNunemroConta()+", "
                            + "Saldo.: "+c.getSaldo()+"\n");
        }
    }
}
