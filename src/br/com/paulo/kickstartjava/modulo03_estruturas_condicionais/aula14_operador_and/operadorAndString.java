package br.com.paulo.kickstartjava.modulo03_estruturas_condicionais.aula14_operador_and;

public class operadorAndString {
    public static void main(String[] args) {
        // &&
        String usuario = "";
        String senha = "";

        if (usuario.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("123")) {
        //Liberado o acesso
            System.out.println("Acesso Liberado!");
        }else {
        //Negar o acesso
            System.out.println("Acesso Negado!");
        }
    }
}
