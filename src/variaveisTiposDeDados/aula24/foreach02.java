package variaveisTiposDeDados.aula24;

public class foreach02 {
    public static void main(String[] args) {
        // for (tipoDado nome Variavel : vetor) { . . . }
        String[] alfabeto = new String[5];

        alfabeto[0] = "A";
        alfabeto[1] = "B";
        alfabeto[2] = "C";
        alfabeto[3] = "D";
        alfabeto[4] = "E";

        for (String item : alfabeto){
            // ...
            System.out.println(item);

        }
    }
}
