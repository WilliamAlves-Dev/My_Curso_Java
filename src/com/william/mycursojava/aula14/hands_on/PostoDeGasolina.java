package com.william.mycursojava.aula14.hands_on;

import java.util.Scanner;

public class PostoDeGasolina {
  public static void main(String[] args) {
    Scanner pergLitro = new Scanner(System.in);
    System.out.println("-=-=-=-POSTO DE GASOSA-=-=-=-");
    System.out.println("\nTabela de descontos:");
    System.out.println("Álcool até 20 litros -> desconto de 3% por litro");
    System.out.println("Álcool acima de 20 litros -> desconto de 5% por litro");
    System.out.println("Gasolina até 20 litros -> desconto de 4% por litro");
    System.out.println("Gasolina acima de 20 litros -> desconto de 6% por litro");

    System.out.print("\nGasolina ou álcool chefe? ");
    String abastecimento = pergLitro.next();
    System.out.print("Quantos litros patrão!? ");
    int litro = pergLitro.nextInt();

    if (abastecimento.equalsIgnoreCase("gasolina")) {
      if (litro <= 20) {
        double valorTotal = litro * 2.50;
        double desconto = (valorTotal * 4) / 100;
        double totalAPagar = valorTotal - desconto;
        System.out.printf("O total a pagar será R$%.2f", totalAPagar);

      } else if (litro > 20) {
        double valorTotal = litro * 2.50;
        double desconto = (valorTotal * 6) / 100;
        double totalAPagar = valorTotal - desconto;
        System.out.printf("O total a pagar será R$%.2f", totalAPagar);
      }
    } else if (abastecimento.equalsIgnoreCase("álcool") || abastecimento.equalsIgnoreCase("alcool")) {

      if (litro <= 20) {
        double valorTotal = litro * 1.90;
        double desconto = (valorTotal * 3) / 100;
        double totalAPagar = valorTotal - desconto;
        System.out.printf("O total a pagar será R$%.2f", totalAPagar);

      } else if (litro > 20) {
        double valorTotal = litro * 1.90;
        double desconto = (valorTotal * 5) / 100;
        double totalAPagar = valorTotal - desconto;
        System.out.printf("O total a pagar será R$%.2f", totalAPagar);

      }
    }

    pergLitro.close();
  }
}
