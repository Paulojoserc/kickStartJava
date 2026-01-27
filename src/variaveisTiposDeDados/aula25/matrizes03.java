package variaveisTiposDeDados.aula25;

import java.util.Scanner;

public class matrizes03 {
    public static void main(String[] args) {
        System.out.println("----------- Mapa do tesouro -----------");
        System.out.println("- 0 1 2 ");
        System.out.println("0 * * * ");
        System.out.println("1 * * * ");
        System.out.println("2 * * * ");
        System.out.println("----------------------------------------");

        boolean[][] mapaTesouro = new boolean[3][3];

        mapaTesouro[1][2] = true;

        Scanner sc = new Scanner(System.in);
        int linhaEixoX;
        int colunaEixoY;

        System.out.println("Onde esta o tesouro? Digite a linha: ");
        linhaEixoX = sc.nextInt();
        sc.nextLine();
        System.out.println("Onde esta o tesouro? Digite a coluna: ");
        colunaEixoY = sc.nextInt();
        sc.nextLine();

        System.out.println("Procurando.... ");

        if (mapaTesouro[linhaEixoX][colunaEixoY]) {
            System.out.println("Achou o tesouro");
        }else{
            System.out.println("Você não achou nada");
        }

    }
}
