package com.william.mycursojava.aula13.hands_on;

import java.util.Scanner;

public class SuperTabuadaTabuada {
    public static void main(String[] args) {
        Scanner pergNum = new Scanner(System.in);
        System.out.println("Digite um número e eu lhe mostrarei sua tabuada COMPLETA: ");
        int numEscolhido = pergNum.nextInt();

        //Adição
        int adi1 = numEscolhido + 1;
        int adi2 = numEscolhido + 2;
        int adi3 = numEscolhido + 3;
        int adi4 = numEscolhido + 4;
        int adi5 = numEscolhido + 5;
        int adi6 = numEscolhido + 6;
        int adi7 = numEscolhido + 7;
        int adi8 = numEscolhido + 8;
        int adi9 = numEscolhido + 9;
        int adi10 = numEscolhido + 10;
        //Subtração
        int sub1 = numEscolhido - 1;
        int sub2 = numEscolhido - 2;
        int sub3 = numEscolhido - 3;
        int sub4 = numEscolhido - 4;
        int sub5 = numEscolhido - 5;
        int sub6 = numEscolhido - 6;
        int sub7 = numEscolhido - 7;
        int sub8 = numEscolhido - 8;
        int sub9 = numEscolhido - 9;
        int sub10 = numEscolhido - 10;
        //Subtração abosluta
        int subAb1 = Math.abs(sub1);
        int subAb2 = Math.abs(sub2);
        int subAb3 = Math.abs(sub3);
        int subAb4 = Math.abs(sub4);
        int subAb5 = Math.abs(sub5);
        int subAb6 = Math.abs(sub6);
        int subAb7 = Math.abs(sub7);
        int subAb8 = Math.abs(sub8);
        int subAb9 = Math.abs(sub9);
        int subAb10 = Math.abs(sub10);
        //Multiplicação
        int mult1 = numEscolhido * 1;
        int mult2 = numEscolhido * 2;
        int mult3 = numEscolhido * 3;
        int mult4 = numEscolhido * 4;
        int mult5 = numEscolhido * 5;
        int mult6 = numEscolhido * 6;
        int mult7 = numEscolhido * 7;
        int mult8 = numEscolhido * 8;
        int mult9 = numEscolhido * 9;
        int mult10 = numEscolhido * 10;
        //Divisão
        int div1 = numEscolhido / 1;
        int div2 = numEscolhido / 2;
        int div3 = numEscolhido / 3;
        int div4 = numEscolhido / 4;
        int div5 = numEscolhido / 5;
        int div6 = numEscolhido / 6;
        int div7 = numEscolhido / 7;
        int div8 = numEscolhido / 8;
        int div9 = numEscolhido / 9;
        int div10 = numEscolhido / 10;

        //Output adição
        System.out.println("-----------------ADIÇÃO-----------------");
        System.out.println(numEscolhido + " + 1 = " + adi1);
        System.out.println(numEscolhido + " + 2 = " + adi2);
        System.out.println(numEscolhido + " + 3 = " + adi3);
        System.out.println(numEscolhido + " + 4 = " + adi4);
        System.out.println(numEscolhido + " + 5 = " + adi5);
        System.out.println(numEscolhido + " + 6 = " + adi6);
        System.out.println(numEscolhido + " + 7 = " + adi7);
        System.out.println(numEscolhido + " + 8 = " + adi8);
        System.out.println(numEscolhido + " + 9 = " + adi9);
        System.out.println(numEscolhido + " + 10 = " + adi10);

        //Output subtração
        System.out.println("-----------------SUBTRAÇÃO-----------------");
        System.out.println(numEscolhido + " - 1 = " + subAb1);
        System.out.println(numEscolhido + " - 2 = " + subAb2);
        System.out.println(numEscolhido + " - 3 = " + subAb3);
        System.out.println(numEscolhido + " - 4 = " + subAb4);
        System.out.println(numEscolhido + " - 5 = " + subAb5);
        System.out.println(numEscolhido + " - 6 = " + subAb6);
        System.out.println(numEscolhido + " - 7 = " + subAb7);
        System.out.println(numEscolhido + " - 8 = " + subAb8);
        System.out.println(numEscolhido + " - 9 = " + subAb9);
        System.out.println(numEscolhido + " - 10 = " + subAb10);

        //Output multiplicação
        System.out.println("-----------------MULTIPLICAÇÃO-----------------");
        System.out.println(numEscolhido + " * 1 = " + mult1);
        System.out.println(numEscolhido + " * 2 = " + mult2);
        System.out.println(numEscolhido + " * 3 = " + mult3);
        System.out.println(numEscolhido + " * 4 = " + mult4);
        System.out.println(numEscolhido + " * 5 = " + mult5);
        System.out.println(numEscolhido + " * 6 = " + mult6);
        System.out.println(numEscolhido + " * 7 = " + mult7);
        System.out.println(numEscolhido + " * 8 = " + mult8);
        System.out.println(numEscolhido + " * 9 = " + mult9);
        System.out.println(numEscolhido + " * 10 = " +  mult10);

        //Output divisão
        System.out.println("-----------------DIVISÃO-----------------");
        System.out.println(numEscolhido + " : 1 = " + div1);
        System.out.println(numEscolhido + " : 2 = " + div2);
        System.out.println(numEscolhido + " : 3 = " + div3);
        System.out.println(numEscolhido + " : 4 = " + div4);
        System.out.println(numEscolhido + " : 5 = " + div5);
        System.out.println(numEscolhido + " : 6 = " + div6);
        System.out.println(numEscolhido + " : 7 = " + div7);
        System.out.println(numEscolhido + " : 8 = " + div8);
        System.out.println(numEscolhido + " : 9 = " + div9);
        System.out.println(numEscolhido + " : 10 = " +  div10);


        pergNum.close();
    }
}
