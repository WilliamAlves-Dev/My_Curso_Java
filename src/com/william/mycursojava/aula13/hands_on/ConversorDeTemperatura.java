package com.william.mycursojava.aula13.hands_on;

import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        Scanner pergTemperatura = new Scanner(System.in);
        System.out.println("Digite uma temperatura em °C e eu lhe mostratei ela em °F: ");
        double celsius = pergTemperatura.nextDouble();
        double CELSIUSPORF = 5 * -32;
        double MULTCELSIUS = celsius * 9;
        double equacaopPt1 = (MULTCELSIUS<0)?(-MULTCELSIUS + CELSIUSPORF) / 5:MULTCELSIUS / 5 + 32;
        
        System.out.println(celsius + "°C em Farenheit são " + equacaopPt1 + "°F");

        pergTemperatura.close();
    
    }
}
