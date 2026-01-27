package br.com.paulo.kickstartjava.modulo03_estruturas_condicionais.aula17_switch;

public class estruturaSwitch01 {
    public static void main(String[] args) {
        //switch

        int opcao = 0;
        switch (opcao){

            case 1:
                System.out.println("Opção com valor de 1");
                break;
            case 2:
                System.out.println("Opção com valor de 2");
                break;
            default:
                System.out.println("Fluxo Padrão! nenhuma opção valida ! ");
                break;
        }
    }
}
