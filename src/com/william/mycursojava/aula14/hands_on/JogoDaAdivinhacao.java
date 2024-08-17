package com.william.mycursojava.aula14.hands_on;

import java.util.Scanner;

public class JogoDaAdivinhacao {
  public static void main(String[] args) {
    Scanner pergNum = new Scanner(System.in);

    System.out.println("-==-==-==-==-==-==-==-==-==-==-==-==-==-==-==-==-==");
    System.out.println("Vou pensar em um número entre 0 e 5. Tente adivinhar! ");
    System.out.println("-==-==-==-==-==-==-==-==-==-==-==-==-==-==-==-==-==");

    System.out.print("\nQual número você escolhe? ");
    int num = pergNum.nextInt();
    int max = 5;
    int min = 0;
    double random = min + (int) (Math.random() * (max - min));

    if (num < 0 || num > 5) {
      System.out.println("O número não está entre 0-5. Por favor, tente novamente. ");
      System.out.print("Qual número você escolhe? ");
      num = pergNum.nextInt();
    }
    if (num == random) {
      System.out.printf("Parabéns, você ganhou! O número escolhido era %.1s", random);
    } else {
      System.out.printf("HAHA! Você perdeu, o número escolhido era %.1s", random);
    }

    pergNum.close();
  }
}
