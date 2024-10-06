package com.william.mycursojava.aula15;

public class LoopForPartesAusentes {
  public static void main(String[] args) {
    // Com todas as partes ausentes
    int count = 1;
    for (;count <= 10;) {
      System.out.println("O valor de count é:" + count);
      count++;
    }

    // Ou com apenas a inicialização ausente

    int i = 0;
    for (;i <= 15; i++) {
      System.out.println("O valor de i é: " + i);
    }

    // Ou com apenas a atualização ausente

    for(int cont = 20; cont >= 10; ) {
      System.out.println("O valor de cont é: " + cont);
      cont--;
    }
  }
}
