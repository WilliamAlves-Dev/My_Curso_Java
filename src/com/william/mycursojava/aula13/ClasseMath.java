package com.william.mycursojava.aula13;

public class ClasseMath {
    public static void main(String[] args) {
        int exponenciacao = (int) Math.pow(5, 2);
        double VALORPI = Math.PI;
        double raizQuadrada = Math.sqrt(25);
        double raizCubica = Math.cbrt(27);
        double valorAbsoluto = Math.abs(5.7);
        double valorAbsoluto2 = Math.abs(-14);
        double arredondamentoParaBaixo = Math.floor(valorAbsoluto);
        int convertendoArredondamento1 = (int) arredondamentoParaBaixo;
        double arredondamentoParaCima = (int) Math.ceil(8.1);
        int arredondamentoAritmeticoOuTradicional = (int) Math.round(4.3);
        int arredondamentoAritmeticoOuTradicional2 = (int) Math.round(4.5);
        
        
        System.out.println("A exponenciação entre 5 e 2 é " + exponenciacao);
        System.out.println("O valor de PI é " + VALORPI);
        System.out.println("A raíz quadrada de 25 é " + raizQuadrada);
        System.out.println("A raíz cúbica de 27 é " + raizCubica);
        System.out.println("Valor abssoluto de 5.7: " + valorAbsoluto);
        System.out.println("Valor abosluto2 de -14: " + valorAbsoluto2);
        System.out.println("Arredondamento para baixo: " + convertendoArredondamento1);
        System.out.println("Arredondamento para cima: " + arredondamentoParaCima);
        System.out.println("Arredondamento aritmético ou tradicional (usado nas escolas): " + arredondamentoAritmeticoOuTradicional);
        System.out.println("Arredondamento aritmético ou tradicional (usado nas escolas): " + arredondamentoAritmeticoOuTradicional2);
    }
}
