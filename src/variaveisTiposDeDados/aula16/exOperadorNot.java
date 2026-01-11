package variaveisTiposDeDados.aula16;

import java.util.Scanner;

public class exOperadorNot {
    public static void main(String[] args) {
        //1. Introdução
        System.out.println("# Universidade de Yale #");
        //2. Solicita a idade do aluno
        System.out.println("Qual a sua idade?");
        //3. Ler a idade
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        sc.nextLine();
        //4. Solicitar a escolaridade
        System.out.println("Qual a sua escolaridade?");
        //5. Ler a escolaridade
        String escolaridade = sc.nextLine();
        //6. Verticar se o aluno é elegivel para concurso
        if (idade <= 22 && !"ensino fundamental".equalsIgnoreCase(escolaridade)) {
            System.out.println("Inscreva-se agora em nosso concurso!");
        }
        System.out.println("Sistema encerrado");
        sc.close();
    }
}
