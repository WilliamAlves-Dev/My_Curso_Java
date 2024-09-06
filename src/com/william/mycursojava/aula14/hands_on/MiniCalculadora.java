package com.william.mycursojava.aula14.hands_on;

import java.util.Scanner;

public class MiniCalculadora {
  public static void main(String[] args) {
    Scanner pergNum = new Scanner(System.in);
    Scanner pergOperador = new Scanner(System.in);
    System.out.print("Informe um número: ");
    int num1 = pergNum.nextInt();
    System.out.print("Informe um segundo número: ");
    int num2 = pergNum.nextInt();
    System.out.print("Qual operação você deseja usar (adição, subtração, multiplicação e divisão)? ");
    String operador = pergOperador.next();

    int soma = 0;
    int sub = 0;
    int mult = 0;
    double div = 0;

    if (operador.equalsIgnoreCase("adição") || operador.equalsIgnoreCase("adicao")) {
      soma = num1 + num2;
      System.out.println("O resultado da soma é: " + soma);
      if (soma % 2 == 0) {
        System.out.println("É um número par!");
      } else {
        System.out.println("É um número ímpar!");
      }

      if (soma >= 0) {
        System.out.println("É um número positivo!");
      } else {
        System.out.println("É um número negativo!");
      }

    } else if (operador.equalsIgnoreCase("subtração") || operador.equalsIgnoreCase("subtracao")) {
      sub = num1 - num2;
      System.out.println("O resultado da subtração é: " + sub);

      if (sub % 2 == 0) {
        System.out.println("É um número par!");
      } else {
        System.out.println("É um número ímpar!");
      }

      if (sub >= 0) {
        System.out.println("É um número positivo!");
      } else {
        System.out.println("É um número negativo!");
      }

    } else if (operador.equalsIgnoreCase("multiplicação") || operador.equalsIgnoreCase("multiplicacao")) {
      mult = num1 * num2;
      System.out.println("O resultado da multiplicação é: " + mult);

      if (mult % 2 == 0) {
        System.out.println("É um número par!");
      } else {
        System.out.println("É um número ímpar!");
      }

      if (mult >= 0) {
        System.out.println("É um número positivo!");
      } else {
        System.out.println("É um número negativo!");
      }

    } else if (operador.equalsIgnoreCase("divisão") || operador.equalsIgnoreCase("divisao")) {
      div = num1 / num2;
      System.out.println("O resultado da divisão é: " + div);

      if (div % 2 == 0) {
        System.out.println("\nÉ um número par!");
      } else {
        System.out.println("É um número ímpar!");
      }

      if (div >= 0) {
        System.out.println("É um número positivo!");
      } else {
        System.out.println("É um número negativo!");
      }
    }

    pergNum.close();
    pergOperador.close();
  }
}
