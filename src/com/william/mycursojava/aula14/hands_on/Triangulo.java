package com.william.mycursojava.aula14.hands_on;

import java.util.Scanner;

public class Triangulo {

    // Não consegui fazer sozinho. Refazer daqui a 1 semana!
    public static void main(String[] args) {
        Scanner pergLado = new Scanner(System.in);
        System.out.print("Informe o primeiro lado do triângulo: ");
        int ladoA = pergLado.nextInt();
        System.out.print("Informe o segundo lado do triângulo: ");
        int ladoB = pergLado.nextInt();
        System.out.print("Informe o terceiro lado do triângulo: ");
        int ladoC = pergLado.nextInt();

        if ((ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB) && (ladoB + ladoC > ladoA)) {

            if (ladoA == ladoB && ladoA == ladoC && ladoB == ladoC) {
                System.out.println("É um triângulo Equilátero!");

            } else if ((ladoA != ladoB) && (ladoA != ladoC) && (ladoB != ladoC)) {
                System.out.println("É um triângulo Escaleno!");

            } else if ((ladoA == ladoB) || (ladoA == ladoC) || (ladoB == ladoC)) {
                System.out.println("É um triângulo Isósceles!");
            }

        } else {
            System.out.println("Não é um triângulo!");
        }

        pergLado.close();
    }

}