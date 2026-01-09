package variaveisTiposDeDados.aula14;

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
