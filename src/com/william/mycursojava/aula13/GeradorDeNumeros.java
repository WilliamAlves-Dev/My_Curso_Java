package com.william.mycursojava.aula13;

public class GeradorDeNumeros {
    public static void main(String[] args) {
        double gerador0a1 = Math.random(); //Gera Número aleatótio de 0,0 a 1,0
        int max = 11;
        int min = 5;
        int gerador5a10 = min + (int) (Math.random() * (max-min));

        System.out.println("Eis aqui o exemplo com valor não definifo (de 0.0 a 1.0): " + gerador0a1);
        System.out.println("Eis aqui um segundo exemplo com valores definidos: " + gerador5a10);
        //Sem o valor minimo definido (caso o valor mínimo seja 0.0)

        int max2 = 21;
        int gerador0a20 = (int) (Math.random() * (max2));
        System.out.println("Eis aqui o exemplo com apenas o valor máximo definifo (sendo o valor mínimo 0, é claro): " + gerador0a20);

    }
}
