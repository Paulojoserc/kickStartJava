package br.com.paulo.kickstartjava.modulo04_estruturas_repeticao.aula21_do_while;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        //do
        //...
        //while (condicao)
        Scanner sc = new Scanner(System.in);

        String resposta = "";

        do {
            System.out.println("Qual a cor do sinal?");
            resposta = sc.nextLine();
            System.out.println("Os carros estão passando!");
        } while (resposta.equalsIgnoreCase("verde"));

        System.out.println("Hora de parar!");
    }

}
