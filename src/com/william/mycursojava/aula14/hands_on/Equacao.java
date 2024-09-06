package com.william.mycursojava.aula14.hands_on;

import java.util.Scanner;

public class Equacao {
  public static void main(String[] args) {
    Scanner pergValor = new Scanner(System.in);
    System.out.println("-=-=-=-=-=-=EQUAÇÃO DO 2º GRAU=-=-=-=-=-=-");
    System.out.print("Informe o valor da variável a: ");
    int variavelA = pergValor.nextInt();
    if (variavelA == 0) {
      System.out.println("Não é uma variável do segundo grau!");
    } else {
      System.out.print("Informe o valor da variável b: ");
      int variavelB = pergValor.nextInt();
      System.out.print("Informe o valor da variável c: ");
      int variavelC = pergValor.nextInt();

      // Etapa 1 da equação

      int delta = (int) (Math.pow(variavelB, 2)) - (4 * variavelA * variavelC);
      if (delta < 0) {
        System.out.println("A equação não possui raízes reais!");
        System.out.println("Δ < 0");
      } else if (delta == 0) {
        System.out.println("A equação possui apenas uma raíz real!");
        System.out.println("Δ = " + delta);
      } else {
        // Etapa 2 da equação

        int numerador = (int) Math.sqrt(delta);
        int denominador = 2 * variavelA;
        int x1 = -(variavelB) + numerador;
        int x2 = -(variavelB) - numerador;
        int xLinha1 = x1 / denominador;
        int xLinha2 = x2 / denominador;

        System.out.println("A equação possui duas raízes reais! São elas: ");
        System.out.println("A primeira raíz é " + xLinha1);
        System.out.println("A segunda raíz é " + xLinha2);
        System.out.println("Δ > 0");
      }

    }

    pergValor.close();
  }
}
