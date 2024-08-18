package com.william.mycursojava.aula14.hands_on;

import java.util.Scanner;

public class ImpostoDeRenda {
    // 3% para o Sindicato
    // FGTS corresponde a 11% do salário bruto (mas NÃO é descontado)
    public static void main(String[] args) {
        Scanner sal = new Scanner(System.in);
        System.out.println("-=-=-=IMPOSTO DE RENDA=-=-=-");
        System.out.print("Informe o valor por cada hora trabalhada: ");
        double valorH = sal.nextDouble();
        System.out.print("Digite a quantidade de horas que você trabalha no mês: ");
        int horaMes = sal.nextInt();

        double salarioB = valorH * horaMes;
        double fgts = salarioB * 11 / 100;

        if (salarioB <= 900) {
            double inss = salarioB * 10 / 100 - 21.18;
            double totalDesconto = inss;

            System.out.printf("\nO salário bruto é de R$%.2f", salarioB);
            System.out.printf("\nJá que você foi isento, o seu salário continua sendo R$%.2f", salarioB);
            System.out.printf("\nO FGTS é de R$%.2f", fgts);
            System.out.printf("\nCom um salário de R$%.2f, o desconto será Isento!", salarioB);
            System.out.printf("\nO INSS será de R$%.2f", inss);
            System.out.printf("\nO total de descontos foi de R$%.2f", totalDesconto);

        }else if (salarioB <= 1500) {
            double desconto = salarioB * 5 / 100;
            double inss = salarioB * 10 / 100 - 21.18;
            double salarioL = salarioB - inss - desconto;
            double totalDesconto = inss + desconto;

            System.out.printf("\nO salário bruto é de R$%.2f", salarioB);
            System.out.printf("\nCom um salário de R$%.2f, você paga um desconto de 5%%", salarioB);
            System.out.printf("\nO FGTS é de R$%.2f", fgts);
            System.out.printf("\nO salário líquido é de R$%.2f", salarioL);
            System.out.printf("\nO INSS será de R$%.2f", inss);
            System.out.printf("\nO total de descontos foi de R$%.2f", totalDesconto);

        } else if (salarioB <= 2500) {
            double desconto = salarioB * 10 / 100;
            double inss = salarioB * 10 / 100 - 21.18;
            double salarioL = salarioB - inss - desconto; 
            double totalDesconto = inss;

            System.out.printf("\nO salário bruto é de R$%.2f", salarioB);
            System.out.printf("\nCom um salário de R$%.2f, você paga um desconto de 10%%", salarioB);
            System.out.printf("\nO FGTS é de R$%.2f", fgts);
            System.out.printf("\nO salário líquido é de R$%.2f", salarioL);
            System.out.printf("\nO INSS será de R$%.2f", inss);
            System.out.printf("\nO total de descontos foi de R$%.2f", totalDesconto);

        } else if (salarioB > 2500) {
            double desconto = salarioB * 10 / 100;
            double inss = salarioB * 10 / 100 - 21.18;
            double salarioL = salarioB - inss - desconto;
            double totalDesconto = inss;

            System.out.printf("\nO salário bruto é de R$%.2f", salarioB);
            System.out.printf("\nCom um salário de R$%.2f, você paga um desconto de 20%%", salarioB);
            System.out.printf("\nO FGTS é de R$%.2f", fgts);
            System.out.printf("\nO salário líquido é de R$%.2f", salarioL);
            System.out.printf("\nO INSS será de R$%.2f", inss);
            System.out.printf("\nO total de descontos foi de R$%.2f", totalDesconto);
        }


        sal.close();
    }
}
