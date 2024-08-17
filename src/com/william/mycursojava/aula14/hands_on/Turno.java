package com.william.mycursojava.aula14.hands_on;

import java.util.Scanner;

public class Turno {
    public static void main(String[] args) {
        Scanner turn = new Scanner(System.in);
        System.out.print("Qual o seu turno de estudos? (Matunino - dia, Vespertino - tarde, ou Noturno - noite: )");
        String turno = turn.next();

        if (turno.equalsIgnoreCase("matunino")) {
            System.out.println("Bom dia!");
        } else if (turno.equalsIgnoreCase("vespertino")) {
            System.out.println("Boa tarde!");
        } else if (turno.equalsIgnoreCase("noturno")) {
            System.out.println("Boa noite!");
        }


        turn.close();
    }
}
