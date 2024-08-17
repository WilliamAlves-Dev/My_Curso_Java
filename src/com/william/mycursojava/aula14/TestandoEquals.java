package com.william.mycursojava.aula14;

import java.util.Scanner;

public class TestandoEquals {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Informe seu nome: ");
    String nome = input.next();

    if (nome.equalsIgnoreCase("william")) { //Esse aqui tanto faz a forma que será escrito (pode ser maiúsculo, minúsculo ou misturado)
      System.out.println("Funcionô!");
    } else {
      System.out.println("Não funciona!");
    }
    if (nome.equals("william")) { //Esse aqui tem que ser identico, nesse caso, tudo minúsculo
      System.out.println("Funcionou2");
    } else {
      System.out.println("Não funcionou2");
    }

    input.close();
  }
}
