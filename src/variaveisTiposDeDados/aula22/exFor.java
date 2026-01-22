package variaveisTiposDeDados.aula22;

import java.util.Scanner;

public class exFor {
    public static void main(String[] args) {
        System.out.println("##Desempenhos - Oracle##");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de membros");
        int quantidadeMembros = sc.nextInt();
        sc.nextLine();

        int mediaTotal = 0;

        for (int i = 1; i <= quantidadeMembros; i++) {
            System.out.println("Digite a nota da membro " + i);
            int notaMembro = sc.nextInt();
            mediaTotal += notaMembro;
        }
        System.out.println("Pesquisa Finalizada!");
        System.out.println("Gerando a media do time......");
        System.out.println("O Desempenho médio do time É: " + mediaTotal / quantidadeMembros);
        sc.close();
    }
}
