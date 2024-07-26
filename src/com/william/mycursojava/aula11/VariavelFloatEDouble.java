package com.william.mycursojava.aula11;

public class VariavelFloatEDouble {
    public static void main(String[] args) {
        // float (números floats terminam com "F"), double 
        float minFloat = (float) Math.pow(-2, 31);   
        float maxFloat = (float) Math.pow(2, 31) - 1;
        double minDouble =  Math.pow(-2, 63);
        double maxDouble =  Math.pow(2,63) - 1;

        System.out.println("O valor mínimo de Float é " + minFloat + " e o máximo é " + maxFloat);
        System.out.println("O valor mínimo de Double é " + minDouble + " e o máximo é " + maxDouble);

    }
}
