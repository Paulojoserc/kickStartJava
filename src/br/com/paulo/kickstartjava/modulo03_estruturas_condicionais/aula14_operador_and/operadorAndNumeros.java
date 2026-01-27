package br.com.paulo.kickstartjava.modulo03_estruturas_condicionais.aula14_operador_and;

public class operadorAndNumeros {
    public static void main(String[] args) {
        int n1 = 15;

        if (n1 > 10 && n1 < 20) {
            System.out.println("Número esta dentro do Limite!");
        } else {
            System.out.println("Número esta fora do Limite!");
        }
    }
}
