package com.william.mycursojava.aula13.hands_on;

import java.util.Scanner;
import java.util.Locale;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        Scanner pergTemperatura = new Scanner(System.in);
        pergTemperatura.useLocale(Locale.US);
        System.out.print("Digite uma temperatura em °C e eu lhe mostratei ela em °F: ");
        double celsius = pergTemperatura.nextDouble();
        double CELSIUSPARAF = 5 * -32;
        double MULTCELSIUS = celsius * 9;
        double equacaopPt1 = (MULTCELSIUS<0)?(-MULTCELSIUS + CELSIUSPARAF) / 5:MULTCELSIUS / 5 + 32;
        
        System.out.format("%.1f°C em Farenheit são %.1f°F", celsius, equacaopPt1);

        pergTemperatura.close();
    
    }
}
