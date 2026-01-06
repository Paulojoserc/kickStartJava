package variaveisTiposDeDados.aula11;

import java.util.Scanner;

public class exOperadorAritmeticos02 {
    public static void main(String[] args) {
        //1. Introduzir o sistema
        System.out.println("SISTEMA DE ARQUITETURA 2.0");
        System.out.println("QUANTIDADE DE REVESTIMENTO PRECISAMOS?");
        Scanner sc = new Scanner(System.in);
        //2. Solicitar a diâmetro em M2
        System.out.println("DIGITE A DIÂMETRO EM METROS: ");
        //3. Ler o valor da diâmetro e armazenar em uma variável (double)
        double diametro = sc.nextDouble();
        //4. Calculando o Metro quadrado.
        //4.1. Descobrir o Raio
        double raio = diametro /2;
        //4.2. Usar a formula para calcular o M2 - PI * R ^ 2
        System.out.println("CALCULANDO O METRO QUADRADO....");
        double metroQuadrado = Math.PI * Math.pow(raio, 2);
        //5. Imprimir o resultado no terminal
        System.out.println("RESULTADO: "+metroQuadrado+"M2");
    }
}
