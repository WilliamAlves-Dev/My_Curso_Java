package com.william.mycursojava.aula14.hands_on;

import java.util.Scanner;

public class AumentoSalario {
  /*
   * Faça um programa que receba o salário de um colaborador das Organizações
   * Tabajara e realize o reajuste segundo o seguinte critério, baseado ao salário
   * atual:
   * .salários até R$280,00 (incluindo) - aumento de 20%;
   * .salários entre R$280,00 e R$700,00 - aumento de 15%;
   * .salários entre R$700,00 e R$1500,00 - aumento de 10%;
   * .salários de R$1500,00 em diante - aumento de 5%;
   * 
   * Após o aumento do salário ser realizado, informe na tela:
   * - O salário antes do ajuste
   * - O percentual da aplicação
   * - O valor do aumento
   * - O salário depois do aumento
   */
  public static void main(String[] args) {
    Scanner pergSal = new Scanner(System.in);
    System.out.println("Digite o salário do colaborador: ");
    double sal = pergSal.nextDouble();

    if (sal <= 280) {
      double ajuste1 = (sal * 20) / 100;
      double aumento1 = sal + ajuste1;

      System.out.printf("Com um aumento de 20%%, o salário que era de R$%.2f passa a ser R$%.2f", sal, aumento1);
      System.out.printf("\nO aumento foi de R$%.2f", ajuste1);
    } else if (sal > 280 && sal <= 700) {
      double ajuste2 = (sal * 15) / 100;
      double aumento2 = sal + ajuste2;

      System.out.printf("Com um aumento de 15%%, o salário que era de R$%.2f passa a ser R$%.2f", sal, aumento2);
      System.out.printf("\nO aumento foi de R$%.2f", ajuste2);
    } else if (sal > 700 && sal <= 1500) {
      double ajuste3 = (sal * 10) / 100;
      double aumento3 = sal + ajuste3;

      System.out.printf("Com um aumento de 10%%, o salário que era de R$%.2f passa a ser R$%.2f", sal, aumento3);
      System.out.printf("\nO aumento foi de R$%.2f", ajuste3);
    } else {
      double ajuste4 = (sal * 5) / 100;
      double aumento4 = sal + ajuste4;

      System.out.printf("Com um aumento de 5%%, o salário que era de R$%.2f passa a ser R$%.2f", sal, aumento4);
      System.out.printf("\nO aumento foi de R$%.2f", ajuste4);
    }

    pergSal.close();
  }
}
