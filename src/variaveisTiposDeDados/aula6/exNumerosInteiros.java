package variaveisTiposDeDados.aula6;

import java.util.Scanner;

public class exNumerosInteiros {
    public static void main(String[] args) {
        //1. iniciando com a frase de efeito
        Scanner sc = new Scanner(System.in);
        System.out.println("VAMOS ATÉ A LUA HOJE!");
        //2. Solicitar o peso do primeiro passageiro
        //3. Armazenar o peso do passageiro 1 em variável
        System.out.println("DIGITE O PESO DO PRIMEIRO PASSAGEIRO: ");
        short peso1 = sc.nextShort();
        //4. Solicitar o peso do segundo passageiro
        //5. Armazenar o peso do passageiro 2 em variável
        System.out.println("DIGITE O PESO DO SEGUNDO PASSAGEIRO: ");
        short peso2 = sc.nextShort();
        //6. Solicitar o peso do terceiro passageiro
        //7. Armazenar o peso do passageiro 3 em variável
        System.out.println("DIGITE O PESO DO TERCEIRO PASSAGEIRO: ");
        short peso3 = sc.nextShort();
        //8. Somar todos os pesos e armazenar em uma variável
        int pesoTotal = (peso1 + peso2 + peso3);
        //9. Viagem Liberada!
        System.out.println("PESO TOTAL DOS PASSAGEIROS: "+pesoTotal+" KG");
        System.out.println("VIAGEM LIBERADA");
    }
}
