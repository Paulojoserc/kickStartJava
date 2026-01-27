package variaveisTiposDeDados.aula24;

import java.util.Scanner;

public class foreach03 {
    public static void main(String[] args) {
        // for (tipoDado nome Variavel : vetor) { . . . }
        System.out.println("Quantas notas serão cadastradas: ");
        Scanner sc = new Scanner(System.in);
        int qtdNotas = sc.nextInt();
        sc.nextLine();


        int[] notas = new int[qtdNotas];

        for (int i = 0; i < qtdNotas; i++) {
            System.out.println("Digite o valor da nota " + (i + 1) + ": ");

            notas[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("Imprimindo os valores das notas: ");
        for (int item : notas) {
            System.out.println(item);
        }

        sc.close();
    }
}
