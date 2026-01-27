package br.com.paulo.kickstartjava.modulo05_vetores_matrizes.aula25_matrizes;

import java.util.Scanner;

public class exMatrizes {
    public static void main(String[] args) {
        //1. Introdução
        System.out.println("# Google - Agenda semanal CLI #");

        // linha - dias da semana = 5
        // colunas - tarefas de cada dia da semana = 8

        Scanner sc = new Scanner(System.in);
        String[][] agenda = new String[5][8];

        for (int dia = 0; dia < 5; dia++) {
            String diaSemana = "";
            switch (dia) {
                case 0:
                    diaSemana = "Segunda";
                    break;
                case 1:
                    diaSemana = "Terca";
                    break;
                case 2:
                    diaSemana = "Quarta";
                    break;
                case 3:
                    diaSemana = "Quinta";
                    break;
                case 4:
                    diaSemana = "Sexta";
                    break;
            }
            System.out.println("Quer Cadastra tarefas para " + diaSemana + "?");

            String resposta = sc.nextLine();
            if (resposta.equalsIgnoreCase("sim")) {
                // Solicitar as tarefas
                for (int tarefas = 0; tarefas < 8; tarefas++) {
                    System.out.println("Digite o nome da tarefa " + (tarefas + 1) + "/8 ou 'Finalizar': ");
                    String nomeTarafas = sc.nextLine();
                    if (nomeTarafas.equalsIgnoreCase("Finalizar")) {
                        break;
                    } else {
                        agenda[dia][tarefas] = nomeTarafas;
                    }
                }
            }
        }

        System.out.println("Agenda finalizada!");

        for (int i = 0; i < 5; i++) {
            String diaSemana = "";
            switch (i) {
                case 0:
                    diaSemana = "Segunda";
                    break;
                case 1:
                    diaSemana = "Terca";
                    break;
                case 2:
                    diaSemana = "Quarta";
                    break;
                case 3:
                    diaSemana = "Quinta";
                    break;
                case 4:
                    diaSemana = "Sexta";
                    break;
            }
            System.out.println("Agenda de "+ diaSemana+":");
            for (int j = 0; j < 8; j++) {
                if (agenda[i][j] != null) {
                    System.out.println("-"+agenda[i][j]);
                }
            }
        }


        sc.close();
    }
}
