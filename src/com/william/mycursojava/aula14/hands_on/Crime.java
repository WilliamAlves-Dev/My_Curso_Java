package com.william.mycursojava.aula14.hands_on;

import java.util.Scanner;

public class Crime {
  public static void main(String[] args) {
    Scanner pergs = new Scanner(System.in);
    System.out.println("-=-=-=-QUESTIONÁRIO SOBRE UM CRIME-=-=-=");
    System.out.println("\nResponda com Sim ou Não.");
    System.out.print("Telefonou para a vítima? ");
    String resposta1 = pergs.next();
    System.out.print("Esteve no local do crime? ");
    String resposta2 = pergs.next();
    System.out.print("Mora perto da vítima? ");
    String resposta3 = pergs.next();
    System.out.print("Devia algo para a vítima? ");
    String resposta4 = pergs.next();
    System.out.print("Já trabalhou com a vítima? ");
    String resposta5 = pergs.next();

    int cont = 0;

    if (resposta1.equalsIgnoreCase("sim")) {
      cont++;
    }
    if (resposta2.equalsIgnoreCase("sim")) {
      cont++;
    }
    if (resposta3.equalsIgnoreCase("sim")) {
      cont++;
    }
    if (resposta4.equalsIgnoreCase("sim")) {
      cont++;
    }
    if (resposta5.equalsIgnoreCase("sim")) {
      cont++;
    }

    if (cont == 2) {
      System.out.println("Você é SUSPEITO!");
    } else if (cont == 3 || cont == 4) {
      System.out.println("Você é CÚMPLICE!");
    } else if (cont == 5) {
      System.out.println("Você é CULPADO!");
    } else {
      System.out.println("Você é INOCENTE!");
    }

/*    
    boolean result = false;

    if (resposta1.equalsIgnoreCase("sim")) {
      result = true;
    } else {
      result = false;
    }
    if (resposta2.equalsIgnoreCase("sim")) {
      result = true;
    } else {
      result = false;
    }
    if (resposta3.equalsIgnoreCase("sim")) {
      result = true;
    } else {
      result = false;
    }
    if (resposta4.equalsIgnoreCase("sim")) {
      result = true;
    } else {
      result = false;
    }
    if (resposta5.equalsIgnoreCase("sim")) {
      result = true;
    } else {
      result = false;
    }
*/
    pergs.close();
  }
}
