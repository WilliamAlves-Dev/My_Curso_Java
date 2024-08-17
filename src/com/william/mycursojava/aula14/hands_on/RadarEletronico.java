package com.william.mycursojava.aula14.hands_on;

import java.util.Scanner;

public class RadarEletronico {
  //Escrever um programa que leia a velocidade atual de um carro. Se ultrapassar 80Km/h, mostre uma mensagem dizendo que você foi multado! 
  //A multa vai custar R$7,00 para cada Km acima do limite.

  public static void main(String[] args) {
    Scanner pergKm = new Scanner(System.in);
    System.out.print("Qual é a velocidade atual do seu carro? ");
    int km = pergKm.nextInt();
    double multa = km * 7;

    if (km > 80) {
       System.out.printf("OPA OPA! Você está ultrapassando o limite de velocidade (80Km/h)! Terás que pagar uma MULTA de R$%.2f", multa);
    } else {
      System.out.println("Tenha um excelente dia! Dirija com CUIDADO!");
    }

    pergKm.close();
  }
}
