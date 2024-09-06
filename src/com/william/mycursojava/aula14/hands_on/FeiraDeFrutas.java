package com.william.mycursojava.aula14.hands_on;

import java.util.Scanner;

public class FeiraDeFrutas {
  public static void main(String[] args) {
    Scanner pergQuantidade = new Scanner(System.in);
    System.out.println("-=-=-=-FEIRINHA DE FRUTAS-=-=-=-");
    System.out.println("Uma feirinha de esquina está vendendo frutas por um preço imperdível! Confira: ");
    System.out.println("Morango - R$2,50 até 5Kg");
    System.out.println("Morando - R$2,20 acima de 5Kg");
    System.out.println("Maçã - R$1,80 até 5Kg");
    System.out.println("Maçã - R$1,50 acima de 5Kg");

    System.out.print("Quantos Kg de morango você levará? ");
    double quantidadeMorango = pergQuantidade.nextInt();
    System.out.print("Quantos Kg de maçã você vai querer? ");
    double quantidadeMaca = pergQuantidade.nextInt();

    double precoMorango = 0;
    double precoMaca = 0;
    double precoAPagar = 0;
    double desconto = 0;
    double totalAPagarComDesconto = 0;

    if (quantidadeMorango <= 5) {
      precoMorango = 2.50 * quantidadeMorango;
      System.out.printf("\nO total a pagar pelo morango será de R$%.2f", precoMorango);

    } else if (quantidadeMorango > 5) {
      precoMorango = 2.20 * quantidadeMorango;
      System.out.printf("\nO total a pagar pelo morango será de R$%.2f", precoMorango);
    }

    if (quantidadeMaca <= 5) {
      precoMaca = 1.80 * quantidadeMaca;
      System.out.printf("\nO total a pagar pela maçã será de R$%.2f", precoMaca);

    } else if (quantidadeMaca > 5) {
      precoMaca = 1.50 * quantidadeMaca;
      System.out.printf("\nO total a pagar pela maçã será de R$%.2f", precoMaca);
    }

    precoAPagar = precoMorango + precoMaca;
    double quilo = quantidadeMorango + quantidadeMaca;
    System.out.printf("\nO total pelas frutas, em dinheiro, é de R$%.2f", precoAPagar);
    System.out.printf("\nO total pelas frutas, em quilos, é de %.0f", quilo);

    if (precoAPagar > 25) {
      // Desconto de 10%
      desconto = (precoAPagar * 10) / 100;
      totalAPagarComDesconto = precoAPagar - desconto;
      System.out.printf(
          "\n\nJá que a compra ultrapassou R$25,00, você terá um desconto de 10%%. Esse é o seu dia de sorte! O preço total será de R$%.2f",
          totalAPagarComDesconto);
    }

    if (quilo > 8) {
      // Desconto de 10%
      desconto = (precoAPagar * 10) / 100;
      totalAPagarComDesconto = precoAPagar - desconto;
      System.out.printf(
          "\n\nJá que a compra ultrapassou 8kg, você terá um desconto de 10%%. Esse é o seu dia de sorte! O preço total será de R$%.2f",
          totalAPagarComDesconto);
    }

    if (precoAPagar > 25 && quilo > 8) {
      // Desconto de 10%
      desconto = (precoAPagar * 10) / 100;
      totalAPagarComDesconto = precoAPagar - desconto;
      System.out.printf(
          "\n\nJá que a compra ultrapassou R$25,00 e 8kg, você terá um desconto de 10%%. Esse é o seu dia de sorte! O preço total será de R$%.2f",
          totalAPagarComDesconto);

    }

    pergQuantidade.close();
  }
}
