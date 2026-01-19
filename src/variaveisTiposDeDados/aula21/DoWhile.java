package variaveisTiposDeDados.aula21;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        //do
        //...
        //while (condicao)
        Scanner sc = new Scanner(System.in);

        String resposta = "";

        do {
            System.out.println("Qual a cor do sinal?");
            resposta = sc.nextLine();
            System.out.println("Os carros estão passando!");
        } while (resposta.equalsIgnoreCase("verde"));

        System.out.println("Hora de parar!");
    }

}
