package br.com.paulo.kickstartjava.modulo03_estruturas_condicionais.aula18_operador_ternario;

import java.util.Scanner;

public class operadorTernario02 {
    public static void main(String[] args) {
        System.out.println("Digite a quantidade de itens que você comprou: ");
        Scanner sc = new Scanner(System.in);
        int qtdItens = sc.nextInt();
        String percentualDesconto = qtdItens > 100 ? "10%" : "5%";
        System.out.println("Você terá o desconto de "+percentualDesconto);

    }
}
