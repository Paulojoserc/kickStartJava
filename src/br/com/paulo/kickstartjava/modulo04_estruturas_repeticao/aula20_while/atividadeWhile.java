package br.com.paulo.kickstartjava.modulo04_estruturas_repeticao.aula20_while;

import java.util.Scanner;

public class atividadeWhile {
    public static void main(String[] args) {

        //while

        System.out.println("Digite um numero: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();


        while (numero != 0) {

            System.out.println(numero);
            numero--;


        }
        System.out.println("Feliz ano novo! ");
    }
}
