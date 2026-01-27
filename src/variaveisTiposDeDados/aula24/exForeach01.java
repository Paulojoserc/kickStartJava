package variaveisTiposDeDados.aula24;

import java.util.Scanner;

public class exForeach01 {
    public static void main(String[] args) {
        System.out.println("/--Todo List CLI - By Microsoft --\\");
        System.out.println("Quantas tarefas você vai criar? ");
        Scanner sc = new Scanner(System.in);
        int qntTarefa = sc.nextInt();
        sc.nextLine();

        String[] tarafas = new String[qntTarefa];
        for (int i = 0; i < qntTarefa; i++) {
            System.out.println("Digite a tarefa " + (i + 1) + ": ");

            tarafas[i] = sc.nextLine();
        }
        System.out.println("Cadastro encarrado");
        System.out.println("Hojé você vai fazer as tarefas: ");
        int cont =0;
        for (String item : tarafas) {
            System.out.println(++cont+"º - "+item);
        }

        sc.close();
    }
}
