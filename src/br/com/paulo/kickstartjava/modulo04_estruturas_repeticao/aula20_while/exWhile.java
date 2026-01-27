package br.com.paulo.kickstartjava.modulo04_estruturas_repeticao.aula20_while;

import java.util.Scanner;

public class exWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Introdução
        System.out.println("##Montanha Russa da Disney##");
        System.out.println("Sistema Inicializado com sucesso");
        System.out.println("Para sair, digite 'FINALIZAR'");
        System.out.println("----------------------------------");
        String resposta = "";


        //2. Criar o loop de ciclo de vida
        while (!resposta.equalsIgnoreCase("FINALIZAR") ) {
          //2.1 Solicitar a altura do passageiro
            System.out.println("Qual a altura do passageiro em CM?");
          //2.2 Ler a altura do passageiro
            resposta = sc.nextLine();
          //2.3 Verificar se a resposta foi finalizar
            if (!resposta.equalsIgnoreCase("FINALIZAR")) {

                //2.4 Converter a resposta para inteiro
                int altura = Integer.parseInt(resposta);
                //2.5 Verificar se a altura é maior que 160
                if (altura >160) {
                    System.out.println("**Viagem Liberada**");
                }else {
                    System.out.println("**Viagem não Liberada**");
                }

            }

        }
        System.out.println("Systema finalizado com sucesso");


        sc.close();
    }
}
