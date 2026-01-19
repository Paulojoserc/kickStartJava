package variaveisTiposDeDados.aula20;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        //while

        System.out.println("Digite um numero: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();


        while (numero != 0) {

            System.out.println(numero);
            numero--;


        }
        System.out.println("Feliz ano novo! ");
    }
}
