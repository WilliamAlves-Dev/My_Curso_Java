package com.william.mycursojava.aula14;

import java.util.Scanner;

public class CondicionalAninhada {
    public static void main(String[] args) {
        Scanner pergPreco = new Scanner(System.in);
        System.out.print("Informe o preço do produto: ");
        double preço = pergPreco.nextDouble();

        if (preço <= 20) {
            System.out.println("Está barato, pode comprar!");
        } else if (preço > 20 && preço <= 50) {
            System.out.println("Deve pedir um desconto!");
        } else {
            System.out.println("Está muito caro!!");
        }

        pergPreco.close();
    }    
}
