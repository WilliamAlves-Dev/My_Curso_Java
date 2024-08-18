package com.william.mycursojava.aula14.hands_on;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner pergLado = new Scanner(System.in);
        System.out.print("Informe o primeiro lado do triângulo: ");
        int lado1 = pergLado.nextInt();
        System.out.print("Informe o segundo lado do triângulo: ");
        int lado2 = pergLado.nextInt();
        System.out.print("Informe o terceiro lado do triângulo: ");
        int lado3 = pergLado.nextInt();

        int maiorLado = 0;
        int somaLado1E2 = 0;
        int somaLado1E3 = 0;
        int somaLado2E3 = 0;

        if (lado1 < lado2 && lado2 < lado3 || lado2 < lado1 && lado1 < lado3) {
            // Lado 3 é o maior
            maiorLado = lado3;
            somaLado1E2 = lado1 + lado2;

        } else if (lado1 < lado3 && lado3 < lado2 || lado3 < lado1 && lado1 < lado2) {
            // Lado 2 é o maior
            maiorLado = lado2;
            somaLado1E3 = lado1 + lado3;

        } else if (lado2 < lado3 && lado3 < lado1 || lado3 < lado2 && lado2 < lado1) {
            // Lado 1 é o maior
            maiorLado = lado1;
            somaLado2E3 = lado2 + lado3;
        }

        if (somaLado1E2 > maiorLado) {
            System.out.println("É um triângulo!");
        } else if (somaLado1E3 > maiorLado) {
            System.out.println("É um triângulo!");
        } else if (somaLado2E3 > maiorLado) {
            System.out.println("É um triângulo!");
        } else {
            System.out.println("Não é um triângulo!");
        }

        System.out.println(maiorLado);

        pergLado.close();
    }
}
