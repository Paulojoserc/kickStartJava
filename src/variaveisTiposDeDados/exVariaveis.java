package variaveisTiposDeDados;

import java.util.Scanner;

public class exVariaveis {
    public static void main(String[] args) {
        //1. Perguntar o nome do funcionário
        System.out.println("SISTEMA DE LIBERAÇÕES");
        System.out.println("DIGITE O NOME DO FUNCIONÁRIO");

        //2. Ler o nome do funcionário
        Scanner sc = new Scanner(System.in);
        String nomeFuncionario = sc.nextLine();

        //3. Imprime a declaração
        System.out.println("GERENCIANDO DECLARAÇÃO.......");
        System.out.println("#####################################");
        System.out.println(nomeFuncionario.toUpperCase());
        System.out.println("ESTÁ LIBERADO PARA JOGAR PING-PONG");
        System.out.println("#####################################");
    }
}
