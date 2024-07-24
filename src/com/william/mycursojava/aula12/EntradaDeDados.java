package com.william.mycursojava.aula12;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner pergName = new Scanner(System.in);
        System.out.println("Qual o seu Nome? ");
        String name = pergName.nextLine();
        System.out.println("Prazer, " + name + ". Fico feliz em te conhecer! É assim que se utiliza a biblioteca (eu acho que é uma biblioteca) Scanner.");
        
        pergName.close();
    }
}
