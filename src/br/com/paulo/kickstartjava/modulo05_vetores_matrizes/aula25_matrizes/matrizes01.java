package br.com.paulo.kickstartjava.modulo05_vetores_matrizes.aula25_matrizes;

import java.util.Arrays;

public class matrizes01 {
    public static void main(String[] args) {

        // tipoDeDado[][] nomeVariavel = { {valor, valor, valor}, {valor, valor, valor} };
        // tipoDeDado[][] nomeVariavel = new tipoDeDado[tamanho da linha [tamanho da coluna];

        String[][] alfabeto = new String[][] { {"A", "B", "C"}, {"D", "E", "F"}};

        System.out.println(Arrays.deepToString(alfabeto));


    }
}
