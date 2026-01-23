package variaveisTiposDeDados.aulo23;

import java.util.Arrays;
import java.util.Scanner;

public class vetoresListaDeTarefas {
    public static void main(String[] args) {
        System.out.println("# Lista de Tarefas #");
        System.out.println("Quantas tarefas você quer cadastrar?");

        Scanner sc = new Scanner(System.in);
        int qtdTarefas = sc.nextInt();
        sc.nextLine();

        String[] tarefas = new String[qtdTarefas];

        for (int c = 0; c < qtdTarefas; c++) {
            System.out.println("Digite a tarefa "+(c+1)+": ");
            tarefas[c] = sc.nextLine();
        }
        System.out.println("Qual é sua lista de tarefas cadastradas é: ");
        System.out.println(Arrays.toString(tarefas));
    }
}
