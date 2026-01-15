package variaveisTiposDeDados.aula17;

import java.util.Scanner;

public class estruturaSwitch02 {
    public static void main(String[] args) {
        System.out.println("Digite uma opção");
        System.out.println("1 - Conta corrente");
        System.out.println("2 - Conta poupança");
        System.out.println("Quer falar com um atendente? Digite qualqer numero diferente das opções acima");

        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Menu conta corrente selecionado");
                break;
            case 2:
                System.out.println("Menu conta poupança selecionado");
                break;
            default:
                System.out.println("Falar com atendente selecionado");
                break;
        }
        System.out.println("Redirecionando o cliente......");


    }
}
