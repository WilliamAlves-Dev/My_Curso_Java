package com.william.mycursojava.aula11;

public class VariavelInteira {
    public static void main(String[] args) {
        // long int short byte
        byte minByte = -128;
        byte maxByte = 127;
        short minShort = -32768;
        short maxShort = 32767; 
        int minInt = (int) Math.pow(-2, 31);   
        int maxInt = (int) Math.pow(2, 31) - 1;
        long minLong = (long) Math.pow(-2, 63);
        long maxLong = (long) Math.pow(2,63) - 1;

        System.out.println("O valor mínimo de Byte é " + minByte + " e o máximo é " + maxByte);
        System.out.println("O valor mínimo de Short é " + minShort + " e o máximo é " + maxShort);
        System.out.println("O valor mínimo de Int é " + minInt + " e o máximo é " + maxInt);
        System.out.println("O valor mínimo de Long é " + minLong + " e o máximo é " + maxLong);
        
    }
    
    
}
