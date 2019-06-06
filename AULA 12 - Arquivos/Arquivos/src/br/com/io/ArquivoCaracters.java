/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author fjrda
 */
public class ArquivoCaracters {
    
    private Path path = Paths.get("C:/Users/fjrda/Documents/NetBeansProjects/Arquivos/caracters.txt");

    private Charset utf8 = StandardCharsets.UTF_8;
    
    public void grava(){       
       
       // Escritor de arquivos
       // Cria um buffer e coloca dados até ficar pronto para ser armazenado       
       //Deposito de dados 
       // Como BufferedWriter implements closable, então as conexões são fechadas
       try (BufferedWriter  escrever =  Files.newBufferedWriter(path, utf8)) {
             
            escrever.write("Tuma de programação|");
            escrever.write("Tuma de sistemas de informação|");
            escrever.write("Tuma de Laboratório de Programação|");
            escrever.flush(); // Pega o Buffer e grava no disco rígido            
        } catch (IOException ex) {
            ex.printStackTrace();
        }    
       
    }
    
    public void le(){
        try(BufferedReader  ler =  Files.newBufferedReader(path, utf8)) {
            String linha;
            while((linha=ler.readLine()) != null){
                System.out.println(linha);
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }
        
}
