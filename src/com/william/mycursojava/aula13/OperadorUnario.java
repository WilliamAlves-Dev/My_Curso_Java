package com.william.mycursojava.aula13;

public class OperadorUnario {
    public static void main(String[] args) {
        System.out.println("\nOs operados unários são: \n");
        System.out.println("Incremento -> ++"); //Antes ou depois da variável
        System.out.println("Decremento -> --,\n"); //Antes ou depois da variável 

        int n1 = 0;
        n1++;
        System.out.println(n1); //Output -> 1
        System.out.println(n1++); //Printa e depois faz o incremento
        System.out.println(n1); //Output -> 2 
        System.out.println(++n1); //Incrementa e depois exibe
        System.out.println(n1--); //Exibe e depois decrementa
        System.out.println(n1); //Output -> 2
        System.out.println(--n1); //Decrementa e depois exibe 


    }
}
