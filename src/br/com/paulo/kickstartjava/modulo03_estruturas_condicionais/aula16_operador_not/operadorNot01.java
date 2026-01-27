package br.com.paulo.kickstartjava.modulo03_estruturas_condicionais.aula16_operador_not;

public class operadorNot01 {
    public static void main(String[] args) {
        /* ! */

        boolean querReceberEmail = true;
        boolean emailEstaComProblema = false;

        if (querReceberEmail && emailEstaComProblema) {
            System.out.println("Enviando email....");
        }
        System.out.println("Sistema encerrado!");

    }
}
