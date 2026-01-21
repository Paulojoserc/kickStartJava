package variaveisTiposDeDados.aula22;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {

        //for (inicialização; condição logica; imcremente/decremento)

        System.out.println("# Sistema de tabuada");
        System.out.println("Digite um número: ");

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        for (int c = 1; c <=10 ; c++) {
            System.out.println(numero + " x " + c + " = " + (numero * c));
        }
    }
}
