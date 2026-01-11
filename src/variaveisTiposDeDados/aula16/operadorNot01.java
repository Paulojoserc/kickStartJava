package variaveisTiposDeDados.aula16;

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
