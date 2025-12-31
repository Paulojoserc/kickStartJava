package variaveisTiposDeDados;

import java.util.Scanner;

public class Variavel {
    public static void main(String[] args) {


        //1. Pergunta ao usuário qual número ele quer digitar
        System.out.println("Usuário, digite um número: ");
        //2. Ler o número que usuário digitou
        Scanner sc = new Scanner(System.in);
        int numeroDigitado = sc.nextInt();
        //3. Multiplicar o valor digitado por 10
        int resultado = numeroDigitado * 10;
        //4. Imprimir no terminal o resultado
        System.out.println("O resultado foi: "+resultado);


    }
}
