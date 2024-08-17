package com.william.mycursojava.aula14.hands_on;
//minuto 23:48 da correção;
import java.util.Scanner;

public class ResultadoDoAluno {
  public static void main(String[] args) {
    Scanner nota = new Scanner(System.in);
    System.out.print("Informe a nota da I unidade do aluno: ");
    double nota1 = nota.nextDouble();
    System.out.print("Informe a nota da II unidade do aluno: ");
    double nota2 = nota.nextDouble();
    double media = (nota1 + nota2) / 2;

    if (media >= 7) {
      System.out.printf("Você foi APROVADO com a nota %.1f!", media);
    } else if (media == 10) {
      System.out.println("Muito bem! Com a nota 10 você foi APROVADO com sucesso!");
    } else {
      System.out.printf("Você foi Reprovado com a nota %.1f! Se esforce mais na próxima.", media);
    }
    nota.close();
  }
}
