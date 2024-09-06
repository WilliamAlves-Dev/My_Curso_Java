package com.william.mycursojava.aula14.hands_on;

import java.util.Scanner;

public class PromocaoDeCarnes {
  public static void main(String[] args) {
    Scanner pergCarne = new Scanner(System.in);
    System.out.println("O Hipermercado Tabajara está com uma promoção de carnes imperdível! Confira: ");
    System.out.println("Filé duplo até 5kg -> R$4,90 por quilo");
    System.out.println("Filé duplo acima de 5kg -> R$5,80 por quilo");
    System.out.println("Alcatra até 5kg -> R$5,90 por quilo");
    System.out.println("Alcatra acima de 5kg -> R$6,80 por quilo");
    System.out.println("Picanha até 5kg -> R$6,90 por quilo");
    System.out.println("Picanha acima de 5kg -> R$7,80 por quilo");

    System.out.println(
        "OBSERVAÇÃO: PARA QUE TODOS POSSAM APROVEITAR A PROMOÇÃO DO NOSSO MERCADO, PEDIMOS PARA QUE VOCêS, PREZADOS CLIENTES, LEVEM APENAS UM TIPO DE CARNE, MAS COM QUANTIDADE ILIMITADA!!!");

    System.out.print("\nQual tipo de carne você gostaria de comprar (FILÉ DUPLO, ALCATRA ou PICANHA)? ");
    String tipoCarne = pergCarne.nextLine();
    System.out.print("Quantos quilos deseja? ");
    double quiloCarne = pergCarne.nextDouble();

    double precoCarne = 0;

    if (tipoCarne.equalsIgnoreCase("file duplo") || tipoCarne.equalsIgnoreCase("filé duplo")) {
      if (quiloCarne <= 5) {
        precoCarne = 4.90;
      } else if (quiloCarne > 5) {
        precoCarne = 5.80;
      }

    } else if (tipoCarne.equalsIgnoreCase("alcatra")) {
      if (quiloCarne <= 5) {
        precoCarne = 5.90;
      } else if (quiloCarne > 5) {
        precoCarne = 6.80;
      }
    } else if (tipoCarne.equalsIgnoreCase("picanha")) {
      if (quiloCarne <= 5) {
        precoCarne = 6.90;
      } else if (quiloCarne > 5) {
        precoCarne = 7.80;
      }
    }

    double precoAPagar = quiloCarne * precoCarne;
    double totalAPagar = 0;
    System.out.printf("\nO total a pagar será de R$%.2f", precoAPagar);

    // Adiciona o newline restante
    pergCarne.nextLine();

    System.out.println("\nQual será a forma de pagamento (dinheiro, Cartão Tabajara ou outro cartão)? ");
    System.out.println("Cliente que pagam usando o Cartão Tabajara ganham 5%% de desconto. Aproveite! ");
    System.out.print("Digite aqui a forma de pagamento: ");
    String formaDePagamento = pergCarne.nextLine();

    if (formaDePagamento.equalsIgnoreCase("cartao tabajara") || formaDePagamento.equalsIgnoreCase("cartão tabajara")) {
      double desconto = (precoAPagar * 5) / 100;
      totalAPagar = precoAPagar - desconto;

      // Informações do Cupom Fiscal
      System.out.println("\n-=-=-=-CUPOM FISCAL-=-=-=-");
      System.out.println("Tipo da carne: " + tipoCarne);
      System.out.printf("Quilos de carne: %.1fkg", quiloCarne);
      System.out.printf("\nPreço: R$%.2f", precoAPagar);
      System.out.println("\nTipo de pagamento:" + formaDePagamento);
      System.out.println("Valor do desconto: 5%");
      System.out.printf("Total a pagar (com desconto): R$%.2f", totalAPagar);

    } else {
      // Informações do Cupom Fiscal
      System.out.println("\n-=-=-=-CUPOM FISCAL-=-=-=-");
      System.out.println("Tipo da carne: " + tipoCarne);
      System.out.printf("Quilos de carne: %.1fkg", quiloCarne);
      System.out.printf("\nTotal a pagar: R$%.2f", precoAPagar);
      System.out.println("\nTipo de pagamento: " + formaDePagamento);
    }

    pergCarne.close();
  }
}
