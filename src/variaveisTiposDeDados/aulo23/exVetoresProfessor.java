package variaveisTiposDeDados.aulo23;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class exVetoresProfessor {
    public static void main(String[] args) {
        //1. Introdução
        System.out.println("## Steam - Gestão de inventários ##");

        //2. Imprimir o menu de opções
        System.out.println(" 1 - Adicionar item");
        System.out.println(" 2 - Remover item");
        System.out.println(" 3 - Sair");

        //3. Iniciar um loop de ciclo de vida do nosso app
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        String[] inventario = new String[3];

        do {
            System.out.println("----");
            //4. Mostrar o inventário do usuário
            System.out.println("Seu inventário: " + Arrays.toString(inventario));
            //5. Perguntar o que ele quer fazer
            System.out.println("O que você quer fazer? ");
            opcao = sc.nextInt();
            int slot;
            sc.nextLine();
            //6. Criar inteligencia para saber se remove ou adiciona items no inventário
            switch (opcao) {
                case 1: // adicionar item
                    System.out.println("Em qual slot você quer guardar o item? ");
                    slot = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Qual o nome do item? ");
                    inventario[slot] = sc.nextLine();
                    break;
                case 2: // remover item
                    System.out.println("Qual slot você quer remover? ");
                    slot = sc.nextInt();
                    sc.nextLine();
                    inventario[slot] = "";
                    break;
                case 3:
                    System.out.println("Game Over");
                default:
                    System.out.println("Opção inválida !");
                    break;
            }

        } while (opcao != 3);
    }
}
