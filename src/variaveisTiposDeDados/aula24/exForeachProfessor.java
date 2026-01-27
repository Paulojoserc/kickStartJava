package variaveisTiposDeDados.aula24;

import java.util.Scanner;

public class exForeachProfessor {
    public static void main(String[] args) {
        //1. Introdução
        System.out.println("-- Todo List CLI by Microsft --\\");

        //2. Solicitar a quantidade de tarefas
        System.out.println("Quantas tarefas você quer cadastrar? ");

        Scanner sc = new Scanner(System.in);
        int qtdTarefas = sc.nextInt();
        sc.nextLine();

        String[] tarefas = new String[qtdTarefas];

        //3. Preencher cada tarefa individualmente

        for (int c = 0; c < qtdTarefas; c++) {

            System.out.println("Digite a tarefa " + (c + 1) + ": ");

            tarefas[c] = sc.nextLine();
        }
        //4. Imprimir as tarefas no terminal
        System.out.println("Hoje você vai fazer as seguintes tarefas: ");
        int c=1;
        for (String tarefa : tarefas) {
            System.out.println(c+ "- "+tarefa);
            c++;
        }

    }
}
