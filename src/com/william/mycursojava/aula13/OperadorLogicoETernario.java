package com.william.mycursojava.aula13;

public class OperadorLogicoETernario {
    public static void main(String[] args) {
        System.out.println("\nEsses são os operadores lógicos: \n");
        System.out.println("&& --- AND   //Os dois têm que ser verdadeiros para o resultado ser true");
        System.out.println("|| --- OR    //Desde que tenha ao menos um verdadeiro ele retornará true");
        System.out.println("^ --- XOR    //Esse aqui precisa ser dois diferentes para ele ter o resultado true \n");

        int n1 = 10;
        int n2 = 5;
        int n3 = 7;
        boolean ternario = (n1>n2)?true:false;
        boolean ternario2 = (n2>n3)?true:false;

        System.out.println("Ternário1: " + ternario);
        System.out.println("Ternário2: " + ternario2);
    }
}
