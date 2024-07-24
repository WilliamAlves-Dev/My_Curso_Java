package com.william.mycursojava.aula13;

public class OperadorDeAtribuicao {
    public static void main(String[] args) {
        System.out.println("\nOs operadores de atribuição são: \n");
        System.out.println("soma e atribui: +=");
        System.out.println("subtrai e atribui: -=");
        System.out.println("multiplica e atribui: *=");
        System.out.println("divide e atribui: /=");
        System.out.println("modúlo (mod) e atribui: %= \n");

        int salarioJunior = 3356;
        salarioJunior += 1800;

        System.out.println(salarioJunior);
        
        //int valor = 5;
        //int n1 += valor;
    }
}
