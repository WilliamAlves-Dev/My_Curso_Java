package com.william.mycursojava.aula13.hands_on;

import java.util.Scanner;
import java.util.Locale;

public class AluguelDeCarro {
    public static void main(String[] args) {
        //Por dia: R$60.00 | KM rodados: R$0.15
        Scanner perg = new Scanner(System.in);
        perg.useLocale(Locale.US);

        System.out.print("Por quantos dias você alugol o carro? ");

        double pergAluguel = perg.nextDouble();
        double diaAlu = pergAluguel * 60;

        System.out.print("\nQuantos KM rodados? ");

        double pergAluguel2 = perg.nextDouble();
        double kmRodados = pergAluguel2 * 0.15;
        double result = diaAlu + kmRodados;

        System.out.format("Com %s dias alugados e %.1fKM rodados, o total a pagar será R$%.2f.",(int) pergAluguel, pergAluguel2, result);

        perg.close();
    }
    
}
