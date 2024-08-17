package com.william.mycursojava.aula14.hands_on;

import java.util.Scanner;

public class ParOuImpar {
  public static void main(String[] args) {
    Scanner pergNum = new Scanner(System.in);
    System.out.print("Digite um número qualquer: ");
    int num = pergNum.nextInt();
    
    if (num % 2 == 0) {
      System.out.printf("O número %s é PAR!", num);
    } else {
      System.out.format("O número %s é ÍMPAR!", num);
    }

    pergNum.close();
  }
}
