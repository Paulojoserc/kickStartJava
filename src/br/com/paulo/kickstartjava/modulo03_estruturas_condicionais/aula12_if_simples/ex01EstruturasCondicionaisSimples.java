package br.com.paulo.kickstartjava.modulo03_estruturas_condicionais.aula12_if_simples;

import java.util.Scanner;

public class ex01EstruturasCondicionaisSimples {
    public static void main(String[] args) {
        //1. - introdução
        System.out.println("*****SISTEMA DE GORJETAS******");
        //2. - Solicitar se o cliente quer dar gorjeta
        System.out.println("VOCÊ GOSTARIA DE FORNECER GORJETA?");
        //3. - Ler a resposta do cliente
        Scanner sc = new Scanner(System.in);
        String resposta = sc.nextLine();
       //4. - Realizar decisão de fluxo
        if (resposta.equalsIgnoreCase("sim")) {
            //4.1 - Solicitar o valor da gorjeta
            System.out.println("QUAL O VALOR DA GORJETA?");
            //4.2 - Ler o valor da gorjeta
            float valor = sc.nextFloat();
            //4.3 - Imprimir agradecendo o valor da gorjeta
            System.out.println("GORJETA DE R$: " + valor + " REALIZADA COM SUCESSO");
        } else {
            //4.4 - Agradecer a visita ao restaurante!
            System.out.println("AGRADECEMOS A VISITA, ATÊ A PRÓXIMA!");
        }
    }
}
