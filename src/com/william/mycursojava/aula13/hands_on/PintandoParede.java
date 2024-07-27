package com.william.mycursojava.aula13.hands_on;

import java.util.Scanner;
import java.util.Locale;

public class PintandoParede {
    public static void main(String[] args) {
        //Criar um programa que diga a quantidade de tinta necessária para se pintar a parede sabendo que 2m² corresponde a 1l de tinta.

        Scanner infoParede = new Scanner(System.in);
        infoParede.useLocale(Locale.US);
        System.out.print("Informe a largura da sua parede: ");
        double largParede = infoParede.nextDouble();
        System.out.print("\nInforme a altura da sua parede: ");
        double altParede = infoParede.nextDouble();
        double mQuadrado = largParede * altParede;
        double lTinta = mQuadrado / 2;

        System.out.println("Uma parede de " + largParede + "m por " + altParede + "m corresponde a " + mQuadrado + "m². Logo, será necessário "+ lTinta + "l de tinta.");


        infoParede.close();

    }
}
