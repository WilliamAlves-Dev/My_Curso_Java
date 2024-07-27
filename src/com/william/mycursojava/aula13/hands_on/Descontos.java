package com.william.mycursojava.aula13.hands_on;

import java.util.Scanner;
import java.util.Locale;

public class Descontos {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        valor.useLocale(Locale.US);
        System.out.print("Digite o valor do produto e eu lhe direi qual será seu valor com 5% de desconto! R$" );
        double valorProduto = valor.nextDouble();
        double desconto = valorProduto * 5 / 100;
        double result = valorProduto - desconto;

        System.out.format("Com o nosso desconto de 5%%, o produto passará a custar R$%.2f! É uma maravilha não é mesmo?!",result);
        
        valor.close();
    }
}
