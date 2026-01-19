package variaveisTiposDeDados.aula21;

import java.util.Scanner;

public class exDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. Introdução
        System.out.println("## Jira CLI ##");
        //2. Estrutura do while
        //
        int opcao;
        String tarefa ="";

        do {
            System.out.println("1 - Criar Tarefa ");
            System.out.println("2 - Criar Projeto ");
            System.out.println("3 - Sair");
            System.out.println("Digite a opcão: ");
            opcao = sc.nextInt();
            sc.nextLine();
            if (opcao == 1){
                System.out.println("Digite o nome do tarefa: ");
                tarefa = sc.nextLine();
                System.out.println("Tarefa criada com sucesso");


            } else  if (opcao == 2){
                System.out.println("Digite o nome do projeto: ");
                tarefa = sc.nextLine();
                System.out.println("Projeto Criada com sucesso");

            }else{
                System.out.println("Sistema finalizado!");
            }
        }while (opcao == 1 || opcao == 2);



        sc.close();
    }
}
