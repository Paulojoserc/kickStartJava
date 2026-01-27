package br.com.paulo.kickstartjava.modulo03_estruturas_condicionais.aula15_operador_or;

import java.util.Scanner;

public class exOperadorOr {
    public static void main(String[] args) {
        //1. Introdução
        System.out.println("*****Antes de você assistir*****");
        //2. Solicitar a idade
        System.out.println("Qual a sua idade");
        //3. Ler a idade
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        sc.nextLine();
        //4. Solicitar se ele tem permissão dos pais
        System.out.println("Você tem permissão dos seus pais?");
        //5. Ler resposta
        String permissao = sc.nextLine();
        //6. Verificar se ele pode assistir ou não
        if (permissao.equalsIgnoreCase("sim") || idade > 17) {
            System.out.println("Acesso liberado!");
        }else{
            System.out.println("Acesso negado!");
        }
    }
}
