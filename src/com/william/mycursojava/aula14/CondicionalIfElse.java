package com.william.mycursojava.aula14;

import java.util.Scanner;

public class CondicionalIfElse {
    public static void main(String[] args) {
        Scanner pergIdade =  new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        
        int idade = pergIdade.nextInt();

        if (idade >= 18) {
            System.out.println("É de maior!");
        } else {
            System.out.println("É de menor!");
        }


        pergIdade.close();
    }    
}
