package com.william.mycursojava.aula14.hands_on;

import java.util.Scanner;

public class CustoDaViagem {
  // Criar um programa que pergunte a distância de uma viagem em Km. Calcule o
  // preço da passagem sabendo que custa R$0,50 para uma viagem de até 200Km e
  // R$0.45 para uma viagem mais longa.

  public static void main(String[] args) {
    Scanner pergKm = new Scanner(System.in);
    System.out.print("Quantos Km até chegar ao seu destino? ");
    double km = pergKm.nextDouble();
    double preco1 = km * 0.50;
    double preco2 = km * 0.45;

    if (km < 0) {
      System.out.print("[ERRO] Por favor, tente novamente: ");
      km = pergKm.nextInt();
    }
    if (km == 0) {
      System.out.println("Não há viagem!");
    }
    if (km > 0 && km <= 200) {
      System.out.println("Com uma viagem de " + km + "Km, o preço da viagem ficará por R$" + preco1);
    } else if (km > 200) {
      System.out.println("Com uma viagem de " + km + "Km, o preço da viagem ficarápor R$" + preco2);
    }

    pergKm.close();
  }
}
