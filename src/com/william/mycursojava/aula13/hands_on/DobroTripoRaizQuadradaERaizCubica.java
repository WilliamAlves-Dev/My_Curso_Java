package com.william.mycursojava.aula13.hands_on;

import java.util.Scanner;

public class DobroTripoRaizQuadradaERaizCubica {
     public static void main(String[] args) {
        Scanner pergNum = new Scanner(System.in);
        System.out.println("Digite um número e eu lhe mostrarei o dobro, o triplo, a raíz quadrada e a raíz cúbica desse número: ");
        int numEscolhido = pergNum.nextInt();
        int dobro = numEscolhido * 2;
        int triplo = numEscolhido * 3;
        double raizQuadrada = Math.sqrt(numEscolhido);
        double raizCubica = Math.cbrt(numEscolhido);
        System.out.println("O dobro de " + numEscolhido + " é " + dobro);
        System.out.println("O triplo de " + numEscolhido + " é " + triplo);
        System.out.println("A raíz quadrada de " + numEscolhido + " é " + raizQuadrada);
        System.out.println("A raíz cúbica de " + numEscolhido + " é " + raizCubica);

        pergNum.close();
    }
}
