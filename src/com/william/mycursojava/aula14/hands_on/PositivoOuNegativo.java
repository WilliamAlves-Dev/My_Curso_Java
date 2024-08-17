package com.william.mycursojava.aula14.hands_on;

import java.util.Scanner;

public class PositivoOuNegativo {
  public static void main(String[] args) {
    Scanner pergNum = new Scanner(System.in);
    System.out.print("Digite um número e eu lhe direi se ele é negativo ou positvo: ");
    double num = pergNum.nextInt();

    if (num >= 0) {
      System.out.printf("O número %s é positivo!", num);
    } else {
      System.out.printf("O número %s é negativo!", num);
    }
    pergNum.close();
  }
}
