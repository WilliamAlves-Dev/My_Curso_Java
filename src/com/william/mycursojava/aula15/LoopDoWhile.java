package com.william.mycursojava.aula15;

public class LoopDoWhile {
  public static void main(String[] args) {
    int count = 1;

    while (count <= 10) {
      System.out.println("O valor de count com While é: " + count);
      count++;
    }

    System.out.println("O valor de count fora do Loop é: " + count); // valor é de 11;

    do {
      System.out.println("O valor de count com Do-While é: " + count); // mostrou o 11 na tela
      count++; // somou + 1 (11 + 1 = 12);
    } while (count < 11); // Não executará mais porque a expressão é falsa;
  }
}
