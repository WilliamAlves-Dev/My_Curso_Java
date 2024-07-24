package com.william.mycursojava.aula13.hands_on;

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);

        //Cantinho das Variáveis :D
        double samarah;
        double ana;
        double bia;
        double everton;
        
        System.out.println("\nDigite uma nota para Samarah: ");
        samarah = nota.nextDouble();
        System.out.println("Digite uma nota para Ana: ");
        ana = nota.nextDouble();
        System.out.println("Digite uma nota para Bia: ");
        bia = nota.nextDouble();
        System.out.println("Digite uma nota para Everton: ");
        everton = nota.nextDouble();

        System.out.println("\nA nota de Samarah é " + samarah);
        System.out.println("A nota de Ana é " + ana);
        System.out.println("A nota de Bia é " + bia);
        System.out.println("A nota de Everton é " + everton);
        double somaNotas = samarah + ana + bia + everton;
        System.out.println("\nA soma das notas é: " + somaNotas);
        double media = somaNotas / 4;
        System.out.println("A média total dos alunos é: " + media);

        
        nota.close();
    }
        
}  
