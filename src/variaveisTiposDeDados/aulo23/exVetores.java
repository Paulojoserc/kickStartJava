package variaveisTiposDeDados.aulo23;

import java.util.Arrays;
import java.util.Scanner;

public class exVetores {
    public static void main(String[] args) {
        System.out.println("## Gestão de inventario ##");

        Scanner sc = new Scanner(System.in);
        int acao = 0;
        String[] slots = {"", "", ""};

        do {
            System.out.println(" 1 - Adicionar item");
            System.out.println(" 2 - Remover item");
            System.out.println(" 3 - Sair");
            System.out.println("Seu inventario: " + Arrays.toString(slots));

            System.out.print("Escolha uma opção: ");
            acao = sc.nextInt();

            if (acao == 1) {
                System.out.print("Em qual índice (0, 1 ou 2) deseja guardar? ");
                int indice = sc.nextInt();
                sc.nextLine(); // Limpar o buffer

                if (indice >= 0 && indice < slots.length) {
                    System.out.print("Nome do item: ");
                    slots[indice] = sc.nextLine();
                } else {
                    System.out.println("Índice inválido!");
                }

            } else if (acao == 2) {
                System.out.print("Qual índice deseja remover? ");
                int indice = sc.nextInt();

                if (indice >= 0 && indice < slots.length) {
                    slots[indice] = "";
                } else {
                    System.out.println("Índice inválido!");
                }
            }

        } while (acao != 3); // Continua enquanto NÃO for 3

        System.out.println("Sistema encerrado. Até logo!");

        sc.close();
    }
}
