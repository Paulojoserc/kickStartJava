package br.com.paulo.kickstartjava.modulo03_estruturas_condicionais.aula14_operador_and;

import java.util.Scanner;

public class exOperadorAnd {
    public static void main(String[] args) {
        //1. Introdução
        System.out.println("****** SISTEMA DE LOGIN - FBI");
        Scanner sc = new Scanner(System.in);
        //2. Solicitar o usuario
        System.out.println("Digite o usuário: ");
        //3. Ler o usuario e armazenar
        String usuario = sc.nextLine();
        //4. Solicitar a senha
        System.out.println("Digite a senha: ");
        //5. Leo a senha e armazenar
        String senha = sc.nextLine();
        //6. Verificar se o usuario e a senha estão corretos.
        if (usuario.equalsIgnoreCase("ADMIN") && senha.equalsIgnoreCase("SECRET")) {
            System.out.println("ACESSO CONCEDIDO!");
            System.out.println("LIBERADO ARQUIVOS SECRETOS....");
        } else {
            System.out.println("##### ALAEME #####");
            System.out.println("AGENTES DO FBI A CAMINHO.....");
        }
    }
}
