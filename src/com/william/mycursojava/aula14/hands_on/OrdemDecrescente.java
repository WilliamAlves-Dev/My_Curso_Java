package com.william.mycursojava.aula14.hands_on;

import java.util.Scanner;

public class OrdemDecrescente {
    public static void main(String[] args) {
        Scanner pergNum = new Scanner (System.in);
        System.out.print("Informe um número: ");
        int num1 = pergNum.nextInt();
        System.out.print("Informe mais um número: ");
        int num2 = pergNum.nextInt();
        System.out.print("Informe o último número: ");
        int num3 = pergNum.nextInt();

        if (num1 > num2 && num1 > num3 && num2 > num3) {
            System.out.println("Aqui vai os números digitados em ordem decrescente: \n");
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
        } else if (num1 > num2 && num1 > num3 && num3 > num2) {
            System.out.println("Aqui vai os números digitados em ordem decrescente: \n");
            System.out.println(num1);
            System.out.println(num3);
            System.out.println(num2);
        } else if (num2 > num1 && num2 > num3 && num1 > num3) {
            System.out.println("Aqui vai os números digitados em ordem decrescente: \n");
            System.out.println(num2);
            System.out.println(num1);
            System.out.println(num3);
        } else if (num2 > num1 && num2 > num3 && num3 > num1) {
            System.out.println("Aqui vai os números digitados em ordem decrescente: \n");
            System.out.println(num2);
            System.out.println(num3);
            System.out.println(num1);
        } else if (num3 > num1 && num3 > num2 && num1 > num2) {
            System.out.println("Aqui vai os números digitados em ordem decrescente: \n");
            System.out.println(num3);
            System.out.println(num1);
            System.out.println(num2);
        } else {
            System.out.println("Aqui vai os números digitados em ordem decrescente: \n");
            System.out.println(num3);
            System.out.println(num2);
            System.out.println(num1);
        }
    
        // Exercício BONÛS
        System.out.println("\nE TEM MAISSSS!!");
        
        // Diz o maior número
        if (num1 > num2 && num1 > num3) {
            System.out.printf("%s é o MAIOR número entre os listados!", num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.printf("\n%s é o MAIOR número entre os listados!", num2);
        } else {
            System.out.printf("\n%s é o MAIOR número entre os listados!", num3);
        }

        //Diz o menor número

        if (num1 < num2 && num1 < num3) {
            System.out.printf("\n%s é o MENOR número entre os listados!", num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.printf("\n%s é o MENOR número entre os listados!", num2);
        } else {
            System.out.printf("\n%s é o MENOR número entre os listados!", num3);
        }
        
        // Soma e Média entre os 3 números listados

        int soma = num1 + num2 + num3;
        double media = soma / 2;

        System.out.printf("\nA soma de todos os números listados é %s", soma);
        System.out.println("\nE a média dos números é " + media);

        pergNum.close();
    }
}
