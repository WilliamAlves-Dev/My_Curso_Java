package com.william.mycursojava.aula14.hands_on;

import java.util.Scanner;

public class MaiorEMenor {
  public static void main(String[] args) {
    Scanner pergNum = new Scanner(System.in);
    System.out.print("Digite o 1º número: ");
    int num1 = pergNum.nextInt();
    System.out.print("Digite o 2º número: ");
    int num2 = pergNum.nextInt();
    System.out.print("Digite o 3º número: ");
    int num3 = pergNum.nextInt();

    if (num1 < num2 && num1 < num3) {
      System.out.println("O menor número é " + num1);
    } else if (num2 < num1 && num2 < num3) {
      System.out.println("O menor número é " + num2);
    } else if (num3 < num1 && num3 < num2) {
      System.out.println("O menor número é " + num3);
    }

    if (num1 > num2 && num1 > num3) {
      System.out.println("O maior número é " + num1);
    } else if (num2 > num1 && num2 > num3) {
      System.out.println("O maior número é " + num2);
    } else if (num3 > num1 && num3 > num2) {
      System.out.println("O maior número é " + num3);
    }
    pergNum.close();
  }

}
