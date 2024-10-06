package com.william.mycursojava.aula15;

public class LoopForWithMoreVariable {
  public static void main(String[] args) {

    for (int count = 1, i = 10; count <= i; count++, i--) {
      System.out.format("\nO valor de count é: %s;  E o valor de i é: %s\n", count, i);

    }
  }
}
