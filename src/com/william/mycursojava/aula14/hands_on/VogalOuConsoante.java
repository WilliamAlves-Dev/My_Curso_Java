package com.william.mycursojava.aula14.hands_on;

import java.util.Scanner;

public class VogalOuConsoante {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Informe uma letra: ");
    String inputSentence = input.next();

    // Correto, mas pode melhorar!
    /*
     * switch (inputSentence) {
     * case "a":
     * case "A":
     * System.out.println("É uma vogal!");
     * break;
     * case "e":
     * case "E":
     * System.out.println("É uma vogal!");
     * break;
     * case "i":
     * case "I":
     * System.out.println("É uma vogal!");
     * break;
     * case "o":
     * case "O":
     * System.out.println("É uma vogal!");
     * break;
     * case "u":
     * case "U":
     * System.out.println("É uma vogal!");
     * break;
     * default:
     * System.out.println("É uma consoante!");
     * break;
     * }
     */

    if (inputSentence.length() > 1) {
      System.out.println("Essa letra não é nem uma vogal e nem uma consoante!");
      System.out.print("Por favor, tente novamente: ");
      inputSentence = input.next();
    } else {
      switch (inputSentence) {
        case "a":
        case "A":
          System.out.println("É uma vogal!");
          break;
        case "e":
        case "E":
          System.out.println("É uma vogal!");
          break;
        case "i":
        case "I":
          System.out.println("É uma vogal!");
          break;
        case "o":
        case "O":
          System.out.println("É uma vogal!");
          break;
        case "u":
        case "U":
          System.out.println("É uma vogal!");
          break;
        default:
          System.out.println("É uma consoante!");
          break;
      }

    }

    input.close();

  }
}
