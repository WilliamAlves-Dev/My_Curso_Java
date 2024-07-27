package com.william.mycursojava.aula13.hands_on;

import java.util.Scanner;
import java.util.Locale;

public class ConversorDeMedidas {
    public static void main(String[] args) {
        Scanner pergMetro = new Scanner(System.in);
        pergMetro.useLocale(Locale.US);
        System.out.println("Digite um número em metros: ");
        double numMetro = pergMetro.nextDouble();
        double km = numMetro / 1000;
        double hm = numMetro / 100;
        double dam = numMetro / 10;
        double dm = numMetro * 10;
        double cm = numMetro * 100;
        double mm = numMetro * 1000;

        System.out.format("%.1f metros são %.3fkm\n", numMetro, km);
        System.out.format("%.1f metros são %.2fhm\n", numMetro, hm);
        System.out.format("%.1f metros são %.1fdam\n", numMetro, dam);
        System.out.println(numMetro + " metros são " + dm + "dm!");
        System.out.println(numMetro + " metros são " + cm + "cm!");
        System.out.println(numMetro + " metros são " + mm + "mm!");

        pergMetro.close();
    }
}
