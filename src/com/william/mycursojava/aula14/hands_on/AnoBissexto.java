package com.william.mycursojava.aula14.hands_on;

import java.util.Scanner;

public class AnoBissexto {
  public static void main(String[] args) {
    Scanner pergAno = new Scanner(System.in);
    System.out.print("Digite um ano e eu lhe direi se ele é bissexto ou não: ");
    int ano = pergAno.nextInt();
    
    int ultimoDigito = ano % 100;

    if (ultimoDigito == 00) {
      int anoBissexto1 = ano % 400;
      if (anoBissexto1 == 0) {
        System.out.println("É um ano Bissexto!");
      } else {
        System.out.println("Não é um ano Bissexto!");
      }

    } else {
        int anoBissexto2 = ano % 4;
        if (anoBissexto2 == 0) {
          System.out.println("É um ano Bissexto!");
      } else {
        System.out.println("Não é um ano Bissexto!");
      }
    }

    pergAno.close();
  }
}
