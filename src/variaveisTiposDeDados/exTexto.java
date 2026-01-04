package variaveisTiposDeDados;

import java.util.Scanner;

public class exTexto {
    public static void main(String[] args) {
        //1. Introdução
        System.out.println("# BEM VINDO A BUILD & RUM GPT#");
        //2. Solicitar um prompt para usuário
        System.out.println("DIGITE UM PROMPT: ");
        //3. Ler o prompt do usuário
        Scanner sc = new Scanner(System.in);
        String prompt = sc.nextLine();
        //4. Contar a quantidade de caracteres no prompt
        int quantidade = prompt.length();
        System.out.println("QUANTIDADE DE CARACTERES: " + quantidade);
    }
}
