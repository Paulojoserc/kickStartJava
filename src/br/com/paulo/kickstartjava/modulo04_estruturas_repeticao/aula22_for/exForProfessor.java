package br.com.paulo.kickstartjava.modulo04_estruturas_repeticao.aula22_for;

import java.util.Scanner;

public class exForProfessor {
    public static void main(String[] args) {
        //1. Introducao
        System.out.println("## Desempenho - Oracle PeopleSoft ##");
        //2. Perguntar a quantidade de membros dentro da equipe
        System.out.println("Quantidade de membros dentro do time? ");
        Scanner sc = new Scanner(System.in);
        int qtdMembros = sc.nextInt();
        sc.nextLine();
        int quantidadeTotalDeNotas = 0;

        //3. Perguntar a nota individual de cada membro
        for (int c = 1; c <= qtdMembros; c++) {
            //codigo a ser repetido
            System.out.println("Digite a nota do membro "+c+" :");
            quantidadeTotalDeNotas = quantidadeTotalDeNotas+sc.nextInt();
        //4. Calcular a nota de desempenho médio do time
            System.out.println("Gerando média do time......");
            System.out.println("Resultado de desempenho médio: "+(quantidadeTotalDeNotas/qtdMembros));
        }
            }
}
