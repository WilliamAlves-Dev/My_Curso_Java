package com.william.mycursojava.aula13.hands_on;

import java.util.Scanner;

public class ConversorDeMoedas {
    public static void main(String[] args) {
        Scanner pergReal = new Scanner(System.in);
        System.out.println("Digite um número em Reais e eu farei a conversão para Doláres, Euros e Wons: ");
        double dindinReal = pergReal.nextDouble();
        double dindinDolar = dindinReal * 0.18;
        double dindinEuro = dindinReal * 0.16;
        double dindinWon = dindinReal * 244.55;

        System.out.println("R$" + dindinReal + " em Doláres são: "+dindinDolar);
        System.out.println("R$" + dindinReal + " em Euros são: "+dindinEuro);
        System.out.println("R$" + dindinReal + " em Wons são: "+dindinWon);


        pergReal.close();
    }
}
