/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author fjrda
 */
public class GraverLerArquivo {
    private Path path = Paths.get("C:/Users/fjrda/Documents/NetBeansProjects/Arquivos/contas.txt");
    private Charset utf8 = StandardCharsets.UTF_8;
    
    public void gravar(){
       try (BufferedWriter  escrever =  Files.newBufferedWriter(path, utf8)) {
            // Percorre uma lista de contas e armazena no arquivo  
           for(Conta c: new ListaDeContas().listaDeContas()){
               escrever.write(c.getCliente()+";"+c.getSaldo()+";"+c.getNunemroConta()+"\n");
           }                        
        } catch (IOException ex) {
            ex.printStackTrace();
        }   
    }
    
    
    
    public ArrayList<Conta> ler(){
        ArrayList contas = new ArrayList();
        
        try(BufferedReader  ler =  Files.newBufferedReader(path, utf8)) {
            String linha;
            while((linha=ler.readLine()) != null){
                String[] s = linha.split(";"); // Array de Strings
               // System.out.println(s[0]+" "+s[1]+" "+s[2]);
                contas.add(new Conta(s[0], Double.parseDouble(s[1]), Integer.parseInt(s[2])));
            }
        } catch (IOException e) {
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
