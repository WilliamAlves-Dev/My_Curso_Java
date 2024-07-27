package com.william.mycursojava.aula13.hands_on;

import java.util.Scanner;
import java.util.Locale;

public class AjusteSalarial {
    public static void main(String[] args) {
        Scanner sal = new Scanner(System.in);
        sal.useLocale(Locale.US);
        System.out.print("Digite um salário para mim :3 (seja generoso!) R$");
        double salario = sal.nextDouble();
        double calculando = 15 * salario / 100;
        double aumento = salario + calculando;
        System.out.format("\nOpa! Recebi um aumento de 15%%, deste modo, meu salário que era de R$%.2f passa a valer R$%.2f!", salario, aumento);

        sal.close();
    }
}
