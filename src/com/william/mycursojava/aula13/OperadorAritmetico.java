package com.william.mycursojava.aula13;

public class OperadorAritmetico {
    public static void main(String[] args) {
        System.out.println("\nOs operadores aritméticos em Java são: \n");
        System.out.println("soma: +");
        System.out.println("subtração: -");
        System.out.println("multiplicação: *");
        System.out.println("divisão: /");
        System.out.println("resto da divisão ou modúlo (mod): %");
        System.out.println("Em Java o operador de exponenciação é a classe matematica \"Math.pow()\". \n");

        int num1 = 5 + 5;
        int num2 = num1 - 1;
        int num3 = num2 * 2;
        int num4 = num3 / 2;
        int num5 = num4 % 3;
        
        System.out.println("5 + 5 = " + num1);
        System.out.println("10 - 1 = " + num2);
        System.out.println("9 * 2 = " + num3);
        System.out.println("18 / 2 = " + num4);
        System.out.println("9 % 3 = " + num5);

    }
}
