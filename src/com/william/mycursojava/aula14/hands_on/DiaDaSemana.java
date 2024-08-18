package com.william.mycursojava.aula14.hands_on;

import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner numSemana = new Scanner(System.in);
        System.out.print("Digite o dia da semana (1-7): ");
        int diaSemana = numSemana.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabádo");
                break;
            default:
                System.out.print("Valor inválido!");
        }

        numSemana.close();
    }
}
