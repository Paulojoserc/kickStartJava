package variaveisTiposDeDados.aula12;

import java.util.Scanner;

public class ex02estruturasCondicionaisSimples {
    public static void main(String[] args) {
        //1. Introdução
        System.out.println("#CALCULADORA#");

        Scanner sc = new Scanner(System.in);
        //2. Solicitar o valor de X
        System.out.println("DIGITE O VALOR DE X: ");
        //3. Ler o valor de X
        double valorx = sc.nextDouble();
        //4. Solicitar o valor de Y
        System.out.println("DIGITE O VALOR DE Y: ");
        //5. Ler o valor de Y
        double valory = sc.nextDouble();
        //6. Solicitar a operação matematica (+, -, * ou / )
        System.out.println("QUAL OPERAÇÃO VOCÊ QUER REALIZAR? AS OPERAÇÕES SÃO: +, -, *, OU /");
        System.out.println();
        //7. Ler a operação
        String operacao = sc.next();
        //8. Verificar a decisão da operação matemática
        if (operacao.equals("+")) {
            double resultado = valorx + valory;
            System.out.println(valorx + " + " + valory + " = " + resultado);
        } else if (operacao.equals("-")) {
            double resultado = valorx - valory;
            System.out.println(valorx + " - " + valory + " = " + resultado);
        } else if (operacao.equals("*")) {
            double resultado = valorx * valory;
            System.out.println(valorx + " * " + valory + " = " + resultado);
        }else if (operacao.equals("/")) {
            double resultado = valorx / valory;
            System.out.println(valorx + " / " + valory + " = " + resultado);
        }else {
            System.out.println("ERRO NA OPERACAO");
        }
    }
}
