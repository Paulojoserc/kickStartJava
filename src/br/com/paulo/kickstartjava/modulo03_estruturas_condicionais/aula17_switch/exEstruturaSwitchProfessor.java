package br.com.paulo.kickstartjava.modulo03_estruturas_condicionais.aula17_switch;

import java.util.Scanner;

public class exEstruturaSwitchProfessor {
    public static void main(String[] args) {
        //1. Introdução da tarefa
        System.out.println("*****Tela estação do ano*****");
        //2. Solicitar o mês atual
        System.out.println("Qual mês nós estamos?");
        System.out.println("1 - Janeiro");
        System.out.println("2 - Fevereiro");
        System.out.println("3 - Março");
        System.out.println("4 - Abril");
        System.out.println("5 - Maio");
        System.out.println("6 - Junho");
        System.out.println("7 - Julho");
        System.out.println("8 - Agosto");
        System.out.println("9 - Setembro");
        System.out.println("10 - Outubro");
        System.out.println("11 - Novembro");
        System.out.println("12 - Dezembro");
        //3. Ler o mês digitado pelo usuário
        Scanner sc = new Scanner(System.in);
        int mes = sc.nextInt();
        //4. Imprimir a estação do ano referente ao mês da opção digitada
        //1, 2, 3 - Verão
        //4, 5, 6 - Outono
        //7, 8, 9 - Inverno
        //10, 11, 12 - Primavera
        switch (mes) {
            case 1:
            case 2:
            case 3:
                System.out.println("Verão!");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Outono!");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Inverno!");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Primavera");
                break;
        }
    }
}