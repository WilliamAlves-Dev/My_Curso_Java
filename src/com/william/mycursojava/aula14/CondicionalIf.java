package com.william.mycursojava.aula14;

import java.util.Scanner;

public class CondicionalIf {
    public static void main(String[] args) {
        Scanner pergIdade = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = pergIdade.nextInt();

        if (idade >= 14) {
            System.out.println("Não é mais criança.");
        }
        
        pergIdade.close();
        
    }
}
