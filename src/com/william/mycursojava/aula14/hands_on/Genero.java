package com.william.mycursojava.aula14.hands_on;

import java.util.Scanner;

public class Genero {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Entre com \"F\" ou \"M\": ");
    String inputGen = input.next();


    //Neste caso (com condições aninhadas), é necessário usar a extensão
    //".equals()" (maiúsculo e minúsculo fazem a diferença) ou
    //".equalsIgnoreCase()" (para ignorar se a letra é maiúscula ou minúscula).
    //Isso ocorre porque String não é um tipo primitivo, mas sim uma classe.
    
    if (inputGen.equalsIgnoreCase("f")) {
      System.out.println("Gênero Feminino");
    } else if (inputGen.equals("m") || inputGen.equals("M")) {
      System.out.println("Gênero Masculino");
    } else {
      System.out.println("Gênero inválido");
    }


    //Exemplo alternativo:
    /*
     * switch (inputGen) {
     * case "F":
     * case "f":
     * System.out.println("Gênero Feminino");
     * break;
     * case "M":
     * case "m":
     * System.out.println("Gênero Masculino");
     * break;
     * default:
     * System.out.println("Gênero inválido");
     * break;
     * }
     */
    input.close();
  }
}
