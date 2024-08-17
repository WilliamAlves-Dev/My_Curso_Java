package com.william.mycursojava.aula14.hands_on;

import java.util.Scanner;

public class ProdutoBarato {
  public static void main(String[] args) {
    Scanner pergPreco = new Scanner(System.in);
    System.out.print("Digite um preço para o PlayStation 5 da Amazon: ");
    double pAmazon = pergPreco.nextDouble();
    System.out.print("Digite um preço para o PlayStation 5 do Mercado Livre: ");
    double pMercadoLivre = pergPreco.nextDouble();
    System.out.print("E por fim, digite um preço para o PlayStation 5 da Shoppe: ");
    double pShoppe = pergPreco.nextDouble();

    System.out.println("\nLista de preços: ");
    System.out.printf("R$%.2f", pAmazon);
    System.out.printf("\nR$%.2f", pMercadoLivre);
    System.out.printf("\nR$%.2f\n", pShoppe);

    if (pAmazon < pMercadoLivre && pAmazon < pShoppe) {
      System.out.printf("\nCompre o PlayStation da Amazon. pois é o mais barato custando R$%.2f", pAmazon);
    } else if (pShoppe < pAmazon && pShoppe < pMercadoLivre) {
      System.out.format("\nCompre o PlayStation da Shoppe, pois é o mais barato custando apenas R$%.2f", pShoppe);
    } else {
      System.out.printf("\nCompre o PlayStation do Mercado Livre, pois é o mais barato atualmente custando R$%.2f", pMercadoLivre);
    }

    pergPreco.close();
  }
}
