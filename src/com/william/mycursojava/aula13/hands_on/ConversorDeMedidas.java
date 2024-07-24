package com.william.mycursojava.aula13.hands_on;

import java.util.Scanner;

public class ConversorDeMedidas {
    public static void main(String[] args) {
        Scanner pergMetro = new Scanner(System.in);
        System.out.println("Digite um número em metros: ");
        float numMetro = pergMetro.nextFloat();
        float km = numMetro / 1000;
        float hm = numMetro / 100;
        float dam = numMetro / 10;
        float dm = numMetro * 10;
        float cm = numMetro * 100;
        float mm = numMetro * 1000;

        System.out.println(numMetro + " metros são " + km + "km!");
        System.out.println(numMetro + " metros são " + hm + "hm!");
        System.out.println(numMetro + " metros são " + dam + "dam!");
        System.out.println(numMetro + " metros são " + dm + "dm!");
        System.out.println(numMetro + " metros são " + cm + "cm!");
        System.out.println(numMetro + " metros são " + mm + "mm!");

        pergMetro.close();
    }
}
