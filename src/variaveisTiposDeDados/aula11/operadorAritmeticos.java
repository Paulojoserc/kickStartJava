package variaveisTiposDeDados.aula11;

public class operadorAritmeticos {
    public static void main(String[] args) {
        //1. Operação matemática simples
        // Soma e Concatenação -> +
        // Subtração           -> -
        // Multiplicação       -> *
        //Divisão              -> /
        //Modulo               -> %


        System.out.println("soma: "+(3+2));
        System.out.println("Concatenação: "+("3 "+2));
        System.out.println("Subtração: "+(3-2));
        System.out.println("Multiplicação: "+(3*2));
        System.out.println("Divisão: "+(10/2));
        System.out.println("Modulo: "+(10%2));


        //2. Incrementos e Decrementos
        int n1 = 5;
        int n2 = 5;
        //Incrementos
        System.out.println(n1++);
        //n1 = 5 +1
        System.out.println(n1);

        //n2 = 5+1
        System.out.println(++n2);
        System.out.println(n2);

        //Decremento
        int n3 = 5;
        int n4 = 5;
        System.out.println(n3--);
        //n1 = 5-1
        System.out.println(n3);

        //n2 = 5-1
        System.out.println(--n2);
        System.out.println(n2);
    }
}
