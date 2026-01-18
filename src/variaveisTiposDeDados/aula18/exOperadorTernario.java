package variaveisTiposDeDados.aula18;

import java.util.Scanner;

public class exOperadorTernario {
    public static void main(String[] args) {
        //1. Introdução
        System.out.println("######Bem vindo ao amazon go######");
        //2. Solicitar ao usuário se ele
        System.out.println("Cliente retirou produto da pratilheira?");
        //3. Ler a resposta do usuário
        Scanner sc = new Scanner(System.in);
        String clienteRetirouProduto = sc.nextLine();
        //4. Indicar se o item foi adicionado ao não no carrinho
        System.out.println(clienteRetirouProduto.equalsIgnoreCase("Sim")
                ? "Item adicionado ao carrinho de compras com sucesso"
                : "Seu carrinho de compra está vazio");

    }
}
