package variaveisTiposDeDados;

import java.sql.SQLOutput;
import java.util.Scanner;

public class exBooleano {
    public static void main(String[] args) {
        //1. Introduzir que é um sistema conta fraudes
        System.out.println("# VERIFICAÇÃO CONTRA FRAUDES #");
        //2. Solicitar ao usuário o valor true ou false
        System.out.println("DIGITE TRUE OU FALSE ABAIXO:");
        Scanner sc = new Scanner(System.in);
        //3. Imprimir qual foi o valor digitado
        boolean condicao = sc.nextBoolean();
        System.out.println("VALOR VERIFICADO: "+condicao);

    }
}
