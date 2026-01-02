package variaveisTiposDeDados;

import java.util.Scanner;

public class exNumerosPontoFlutuantes {
    public static void main(String[] args) {
        //1. Informa qual é o objetivo do sistema
        Scanner sc = new Scanner(System.in);
        System.out.println("SISTEMA DE PESAGEM DE PACIENTES");
        //2. Solicitar e Armazenar os pesos dos mês de janeiro a dezembro em variáveis
        System.out.println("DIGITE O PESO EM JANEIRO");
        float pesoJaneiro = sc.nextFloat();
        System.out.println("DIGITE O PESO EM FEVEREIRO");
        float pesoFevereiro = sc.nextFloat();
        System.out.println("DIGITE O PESO EM MARÇO");
        float pesoMarco = sc.nextFloat();
        System.out.println("DIGITE O PESO EM ABRIL");
        float pesoAbril = sc.nextFloat();
        System.out.println("DIGITE O PESO EM MAIO");
        float pesoMaio = sc.nextFloat();
        System.out.println("DIGITE O PESO EM JUNHO");
        float pesoJunho = sc.nextFloat();
        System.out.println("DIGITE O PESO EM JULHO");
        float pesoJulho = sc.nextFloat();
        System.out.println("DIGITE O PESO EM AGOSTO");
        float pesoAgosto = sc.nextFloat();
        System.out.println("DIGITE O PESO EM SETEMBRO");
        float pesoSetembro = sc.nextFloat();
        System.out.println("DIGITE O PESO EM OUTUBRO");
        float pesoOutubro = sc.nextFloat();
        System.out.println("DIGITE O PESO EM NOVEMBRO");
        float pesoNovembro = sc.nextFloat();
        System.out.println("DIGITE O PESO EM DEZEMBRO");
        float pesoDezembro = sc.nextFloat();
        //3. Somar todos os pesos e armazenados em variáveis
        float mediaMes = (pesoJaneiro + pesoFevereiro + pesoMarco + pesoAbril + pesoMaio + pesoJunho + pesoJulho + pesoAgosto + pesoSetembro + pesoOutubro + pesoNovembro + pesoDezembro) / 12;

        //4. Calcular o peso médio dos pacientes!
        System.out.println("MÉDIA: " + mediaMes);
    }
}