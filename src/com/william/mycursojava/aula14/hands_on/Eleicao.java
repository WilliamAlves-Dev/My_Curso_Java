package com.william.mycursojava.aula14.hands_on;

import java.util.Scanner;

public class Eleicao {
  public static void main(String[] args) {
    Scanner pergIdade = new Scanner(System.in);
    System.out.print("Informe a sua idade: ");
    int idade = pergIdade.nextInt();
    
    if (idade < 0) {
      System.out.println("Idade inválida. Por favor, tente novamente: ");
      System.out.print("Informe a sua idade: ");
      idade = pergIdade.nextInt();
    }
    if (idade < 16) {
      System.out.format("Com %s anos, você não pode votar.", idade);
    } else if (idade >= 16 && idade < 18 || idade >= 70) {
      System.out.printf("Com %s anos, seu voto é opcional.", idade);
    } else {
      System.out.format("Com %s anos, o seu voto é obrigatório.", idade);
    }

    pergIdade.close();
  }
}
