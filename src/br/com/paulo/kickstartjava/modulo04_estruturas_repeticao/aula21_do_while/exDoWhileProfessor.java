package br.com.paulo.kickstartjava.modulo04_estruturas_repeticao.aula21_do_while;

import java.util.Scanner;

public class exDoWhileProfessor {
    public static void main(String[] args) {
        //1. Introdução
        System.out.println("## Jira CLI ##");

        //2. Estrutura Do While
        //Scanner
        //Resposta
        Scanner sc = new Scanner(System.in);
        String resposta = "";

        do {

            //3. Indicar o menu de opções
            System.out.println("1 - Criar Tarefa");
            System.out.println("2 - Criar Projeto");
            System.out.println("3 - Sair");
            System.out.println("Digite uma opção: ");
            //4. Ler a resposta do usuário
            resposta = sc.nextLine();
            //5. Criar Inteligencia para verificar a resposta do usuário
            switch (resposta) {
                case "1":
                    //criar tarefa
                    System.out.println("Digite o nome do tarefa:");
                    String nomeTarefa = sc.nextLine();
                    System.out.println("Tarefa [" + nomeTarefa + "] criada com sucesso!");
                    break;
                case "2":
                    //criar projeto
                    System.out.println("Digite o nome do projeto:");
                    String nomeProjeto = sc.nextLine();
                    System.out.println("Projeto [" + nomeProjeto + "] criada com sucesso!");
                    break;
                case "3":
                    System.out.println("Finalizando.....");
                    break;
                default:
                    System.out.println("Opção está invalida!");
                    break;
            }

        } while (!resposta.equalsIgnoreCase("3"));
    }
}
