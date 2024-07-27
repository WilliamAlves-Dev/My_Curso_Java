package com.william.mycursojava.aula13.hands_on;

import java.util.Scanner;
import java.util.Locale;

public class ConversorDeMoedas {
    public static void main(String[] args) {
        Scanner pergReal = new Scanner(System.in);
        pergReal.useLocale(Locale.US);
        System.out.println("Digite um número em Reais e eu farei a conversão para Doláres, Euros e Wons: ");
        System.out.print("R$");
        Double dindinReal = pergReal.nextDouble();
        Double dindinDolar = dindinReal * 0.18;
        Double dindinEuro = dindinReal * 0.16;
        Double dindinWon = dindinReal * 244.55;
        System.out.format("R$%.2f em Dólares são: U$%.2f \n", dindinReal, dindinDolar);
        System.out.format("R$%.2f em Euros são: €%.2f \n", dindinReal, dindinEuro);
        System.out.format("R$%.2f em Wons são: ₩%.2f \n", dindinReal, dindinWon);


        pergReal.close();
    }
}
