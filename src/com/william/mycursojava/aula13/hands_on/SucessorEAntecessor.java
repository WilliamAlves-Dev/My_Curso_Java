package com.william.mycursojava.aula13.hands_on;

import java.util.Scanner;

public class SucessorEAntecessor {
    public static void main(String[] args) {
        Scanner pergNum = new Scanner(System.in);
        System.out.println("Digite um número e eu lhe mostrarei seu sucessor e antecessor: ");
        int numEscol =  pergNum.nextInt();
        int sucessor = numEscol + 1;
        int antecessor = numEscol - 1;
        System.out.println("O sucessor do seu número escolhido é " + sucessor + "!");
        System.out.println("O antecessor do seu número escolhido é " + antecessor + "!");

        pergNum.close();
    }    
}
