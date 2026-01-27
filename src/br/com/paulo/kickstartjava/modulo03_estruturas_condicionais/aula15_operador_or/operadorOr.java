package br.com.paulo.kickstartjava.modulo03_estruturas_condicionais.aula15_operador_or;

public class operadorOr {
    public static void main(String[] args) {
        // ||
        boolean isFanalDeSemana = false;
        boolean isFeriado = true;
        if (isFanalDeSemana || isFeriado) {
            System.out.println("Eh dia de Descansar");
        }else  {
            System.out.println("Eh dia de Trabalhar ");
        }
    }
}
