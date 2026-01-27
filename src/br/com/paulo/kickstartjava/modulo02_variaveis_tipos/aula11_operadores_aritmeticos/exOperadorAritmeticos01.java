package br.com.paulo.kickstartjava.modulo02_variaveis_tipos.aula11_operadores_aritmeticos;

import java.util.Scanner;

public class exOperadorAritmeticos01 {
    public static void main(String[] args) {
        //1. Introduzir o sistema
        System.out.println("SISTEMA DE ARQUITETURA");
        System.out.println("CALCULAR O METRO QUADRADO?");
        Scanner sc = new Scanner(System.in);
        //2. Solicitar a largura em M2
        System.out.println("DIGITE A LARGURA EM METROS");
        //3. Ler o valor da largura e armazenar em uma variável (float)
        float Largura = sc.nextFloat();
        //4. Solicitar a altura em M2
        System.out.println("DIGITE A ALTURA EM METROS: ");
        //5. Ler o valor da altura e armazenar em uma variável (float)
        float Altura = sc.nextFloat();
        //6. Calculando o M2 (largura * altura)
        System.out.println("CALCULANDO O METRO QUADRADO....");
        float metroQuadrado = Largura * Altura;
        System.out.println("RESULTADO: "+(int)metroQuadrado+"M2");
    }
}
