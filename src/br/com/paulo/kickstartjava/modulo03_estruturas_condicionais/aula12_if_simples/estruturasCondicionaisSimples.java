package br.com.paulo.kickstartjava.modulo03_estruturas_condicionais.aula12_if_simples;

import java.util.Scanner;

public class estruturasCondicionaisSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a idade:");
        int idade = sc.nextInt();
        boolean condicao = idade >= 18;
        //if (idade >= 18) {
        if(condicao){
            System.out.println("Eh verdadeiro!");
        }else{
            System.out.println("Eh falso!");
        }
    }
}
