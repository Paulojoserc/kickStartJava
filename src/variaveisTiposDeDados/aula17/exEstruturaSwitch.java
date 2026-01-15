package variaveisTiposDeDados.aula17;

import java.util.Scanner;

public class exEstruturaSwitch {
    public static void main(String[] args) {
        //1. Introdução da tarefa
        System.out.println("*****Tela estação do ano*****");
        //2. Solicitar o mês atual
        System.out.println("Qual mês nós estamos?");
        System.out.println("1 - Janeiro");
        System.out.println("2 - Fevereiro");
        System.out.println("3 - Março");
        System.out.println("4 - Abril");
        System.out.println("5 - Maio");
        System.out.println("6 - Junho");
        System.out.println("7 - Julho");
        System.out.println("8 - Agosto");
        System.out.println("9 - Setembro");
        System.out.println("10 - Outubro");
        System.out.println("11 - Novembro");
        System.out.println("12 - Dezembro");
        System.out.println("0 Sair do sistema");
        //3. Ler o mês digitado pelo usuário
        Scanner sc = new Scanner(System.in);
        int mes = sc.nextInt();
        //4. Imprimir a estação do ano referente ao mês da opção digitada
        switch (mes){
            case 1:
                System.out.println("Você escolheu mês de Janeiro fim de ferias bom de praia e inicio do Verão");
                break;
            case 2:
                System.out.println("Você escolheu mês de Fevereiro menor mês do ano e estação verão");
                break;
            case 3:
                System.out.println("Você escolheu o mês de Março é fim do verão ");
                break;
            case 4:
                System.out.println("Você escolheu mês de Abril que tem um dia da mentia e começa o Outono");
                break;
            case 5:
                System.out.println("Você escolheu mês de Maio mês das noiva e continua outono");
                break;
            case 6:
                System.out.println("Você escolheu mês de Junho mês que fim do outono");
                break;
            case 7:
                System.out.println("Você escolheu mês de Julho mês das ferias inicio do inverno");
                break;
            case 8:
                System.out.println("Você escolheu mês de Agosto mês que é triste e bom pelo inverno");
                break;
            case 9:
                System.out.println("Você escolheu mês de Setembro mês da nossa independência e fim do inverno");
                break;
            case 10:
                System.out.println("Você escolheu mês de Outubro conhecido como mês das crianças e inicio da primavera");
                break;
            case 11:
                System.out.println("Você escolheu mês de Novembro que fica na primavera");
                break;
            case 12:
                System.out.println("Você escolheu mês de Dezembro o ultimo mês do ano e da primavera");
                break;
            case 0:
                System.out.println("Obrigado por usar o nosso sistema das estações do ano");
                break;
            default:
                System.out.println("Mês não existe");
                break;

        }
    }
}
