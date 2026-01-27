package br.com.paulo.kickstartjava.modulo04_estruturas_repeticao.aula22_for;

import java.util.Scanner;

public class atividadeFor {
    public static void main(String[] args) {

        //for (inicialização; condição logica; imcremente/decremento)

        System.out.println("# Sistema de tabuada");
        System.out.println("Digite um número: ");

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        for (int c = 1; c <=10 ; c++) {
            System.out.println(numero + " x " + c + " = " + (numero * c));
        }
    }
}
