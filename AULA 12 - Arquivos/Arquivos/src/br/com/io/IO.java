/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.io;

// No passado manipulacao de arquivos eram
// feitas por classes que estao no pacote
// io, agora usa-se as classes do pacote nio (new io)
// que passou por uma otimizacao
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author fjrda
 */
public class IO {
    public void pegaCaminho() throws Exception{
        
        // A partir do java 7
        // No windows
        Path path = Paths.get("C:/Users/fjrda/Documents/NetBeansProjects/Arquivos/texto.txt");
        
        // No linux
        Path p = Paths.get("/Users/fjrdaDocuments/NetBeansProjects/Arquivos/texto.txt");
        
        // Caminho absoluto do arquivo texto.txt
        path.toAbsolutePath();
        
        // Diretório onde o arquivo texto.txt está
        path.getParent();
        
        // Raiz do sistema
        path.getRoot();
        
        // Nome do arquivo
        path.getFileName();
        
        /* CRIANDO DIRETÓRIO*/
        Files.createDirectories(path.getParent());
        
        
        /*ESCREVER E LER ARQUIVOS*/
        byte[] b = "Manipulando arquivos".getBytes();
        
        // Cria o arquivo, caso não exista, cria, abre, limpa, escreve e fecha o arquivo
        // Bom para ser utilizado com arquivos pequenos
        Files.write(path, b);
        
        // Le um arquivo e retorna um conjunto de bytes
        byte[] bs = Files.readAllBytes(path);
        System.out.println(new String(bs));
    }
}
