package com.william.mycursojava.aula15.hands_on;

import java.util.Scanner;

public class DeUmADez {
    public static void main(String[] args) {
        Scanner perg = new Scanner(System.in);
        System.out.print("Escolha um número de 1 a 10: ");
        int pergNum = perg.nextInt();
        
        while (pergNum != 1 && pergNum != 2 && pergNum != 3 && pergNum != 4 && pergNum != 5 && pergNum != 6 && pergNum != 7 && pergNum != 8 && pergNum != 9 && pergNum != 10) {
            System.out.println("Por favor, tente novamente: ");
            pergNum = perg.nextInt();
        }

        System.out.println("O seu número foi: " + pergNum);

        perg.close();
    }
}
