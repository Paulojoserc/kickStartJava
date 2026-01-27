package br.com.paulo.kickstartjava.modulo05_vetores_matrizes.aula24_foreach;

public class foreach01 {
    public static void main(String[] args) {
        // for (tipoDado nome Variavel : vetor) { . . . }
        int[] numeros = new int[] {5, 2, 7, 1, 0, 6, 75, 38, 9, 10};
        for (int item : numeros){
            // ...
            System.out.println(item);

        }
    }
}
