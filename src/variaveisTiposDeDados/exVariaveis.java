package variaveisTiposDeDados;

import java.util.Scanner;

public class exVariaveis {
    public static void main(String[] args) {
        System.out.println("SISTEMA DE LIBERAÇÕES");
        System.out.println("DIGITE O NOME DO FUNCIONÁRIO");
        Scanner sc = new Scanner(System.in);
        String nomeFuncionario = sc.nextLine();
        System.out.println("GERENCIANDO DECLARAÇÃO.......");
        System.out.println("#####################################");
        System.out.println(nomeFuncionario.toUpperCase());
        System.out.println("ESTÁ LIBERADO PARA JOGAR PING-PONG");
        System.out.println("#####################################");
    }
}
