package variaveisTiposDeDados;


import java.util.Scanner;

public class exCasting {
    public static void main(String[] args) {
        //1. Solicitar um número com ponto flutuante
        System.out.println("DIGITE UM NÚMERO COM PONTO FLUTUANTE: ");

        //2. Ler esse número e armazenar em uma variável (String)
        Scanner sc = new Scanner(System.in);
        String numeroPontoFlutuante = sc.nextLine();

        //3. Converter para Double e Float
        double textoParaPontoFlutuante = Double.parseDouble(numeroPontoFlutuante.replace(",","."));
        double numeroDouble = textoParaPontoFlutuante;
        System.out.println("CONVERTIDO PARA DOUBLE: "+numeroDouble);
        float numeroFloat = (float) textoParaPontoFlutuante;
        System.out.println("CONVERTIDO PARA FLOAT: "+numeroFloat);
        System.out.println();

        //4. Solicitar um número inteiro
        System.out.println("DIGITE UM NÚMERO INTEIRO: ");

        //5. Ler esse número e armazenar em uma variável (String)
        String numeroInteiro = sc.nextLine();
        int textoParaInteiro = Integer.parseInt(numeroInteiro);

        //6. Conveter para Byte, Short, Int e Long
        byte numeroByte = (byte) textoParaInteiro;
        System.out.println("CONVERTIDO PARA BYTE: "+numeroByte);
        short numeroShort = (short) textoParaInteiro;
        System.out.println("CONVERTIDO PARA SHORT: "+numeroShort);
        int numeroInt = textoParaInteiro;
        System.out.println("CONVERTIDO PARA INT: "+numeroInt);
        long numeroLong = textoParaInteiro;
        System.out.println("CONVERTIDO PARA LONG: "+numeroLong);


    }
}
