package com.william.mycursojava.aula14;

import java.util.Scanner;

public class CondicionalSwitchCase {
    public static void main(String[] args) {
        Scanner pergData = new Scanner(System.in);
        System.out.println("Digite a data da semana (1-7): ");
        int dataSemana = pergData.nextInt();

        switch (dataSemana) {
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
                System.out.println("Sábado");
                break;
            default:
            System.out.println("Dia inválido. Tente novamente.");
        }

        pergData.close();
    }    
}
