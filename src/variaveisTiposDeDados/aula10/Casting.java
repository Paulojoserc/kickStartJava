package variaveisTiposDeDados.aula10;

public class Casting {
    public static void main(String[] args) {
        // Widening Casting (Automático) = byte -> short -> char -> int -> long -> float -> double
        //Narrowing Casting (manual) = double -> float -> long -> int -> char -> short -> byte

        int tipoMenor =10;
        double tipoMaior = tipoMenor;

        System.out.println("Tipo int " +tipoMenor);
        System.out.println("Tipo double recebendo o valor int " +tipoMaior);

        double tipoMaior2 = 35.0;
        int tipoMenor2 =(int) tipoMaior2;

        System.out.println("Tipo int recebendo o valor double "+ tipoMenor2);
        System.out.println("Tipo double "+ tipoMaior2);

        //Converter String para Tipos Primitivos e o caminho reverso
        String texto = "50";
        int n2 =  Integer.parseInt(texto);
        int n1 = 50;
        System.out.println("Soma de int com uma String "+ (n2 + n1));

        int numero = 150;

        String valorConvertido = String.valueOf(numero);

        System.out.println("Valor int transformado em uma String "+valorConvertido);




    }
}
