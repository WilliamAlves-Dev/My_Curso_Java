package com.william.mycursojava.aula14.hands_on;

import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args) {
        Scanner pergNota = new Scanner(System.in);
        System.out.print("\nDigite a nota de matemática do aluno no 1º semestre: ");
        double nota1 = pergNota.nextDouble();
        System.out.print("Digite a nota de matemática do aluno no 2º semestre: ");
        double nota2 = pergNota.nextDouble();
        double media = (nota1 + nota2) / 2;

        if (media > 9 && media <= 10) {
            // A
            System.out.println("\nAprovado!");
            System.out.println("\nA sua nota foi A!");
            System.out.println("A nota do primeiro semestre foi " + nota1);
            System.out.println("A sua nota do segundo semestre foi " + nota2);
            System.out.println("A sua média foi " + media);

        } else if (media >= 7.5 && media <= 9) {
            // B
            System.out.println("\nAprovado!");
            System.out.println("\nA sua nota foi B!");
            System.out.println("A nota do primeiro semestre foi " + nota1);
            System.out.println("A sua nota do segundo semestre foi " + nota2);
            System.out.println("A sua média foi " + media);

        } else if (media >= 6 && media < 7.5) {
            // C
            System.out.println("\nAprovado!");
            System.out.println("\nA sua nota foi C!");
            System.out.println("A nota do primeiro semestre foi " + nota1);
            System.out.println("A sua nota do segundo semestre foi " + nota2);
            System.out.println("A sua média foi " + media);

        } else if (media >= 4 && media < 6) {
            // D
            System.out.println("\nReprovado!");
            System.out.println("\nA sua nota foi D!");
            System.out.println("A nota do primeiro semestre foi " + nota1);
            System.out.println("A sua nota do segundo semestre foi " + nota2);
            System.out.println("A sua média foi " + media);

        } else if (media >= 0 && media < 4) {
            // E
            System.out.println("\nReprovado!");
            System.out.println("\nA sua nota foi E!");
            System.out.println("A nota do primeiro semestre foi " + nota1);
            System.out.println("A sua nota do segundo semestre foi " + nota2);
            System.out.println("A sua média foi " + media);

        }

        pergNota.close();
    }
}
