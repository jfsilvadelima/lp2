/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.io;

/**
 *
 * @author fjrda
 */
public class Main {
    public static void main(String[] args) {
        try {
            new ArquivoCaracters().grava();
            new ArquivoCaracters().le();
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
