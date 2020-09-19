package Main;

import DataLayer.ClienteModel;
import DataLayer.ProdutoModel;
import LogicLayer.ClienteController;
import PersistenceLayer.ClientePersistence;
import PersistenceLayer.ProdutoPersistence;

import java.util.Scanner;

public class Terminal {
    private static ClienteModel user;

    public static void main(String[] args) {
        login();
        getMenu();
    }

    public static void login() {
        Scanner input = new Scanner((System.in));
        System.out.println("Sistema de E-Commerce!");
        System.out.println("======================");
        System.out.println("Insira seu cpf: ");
        ClientePersistence clientes = new ClientePersistence();
        String cpf = input.nextLine();
        Terminal.user = clientes.getClienteByCPF(cpf);
    }

    public static void getMenu() {
        Scanner input = new Scanner((System.in));
        System.out.println("Sistema de E-Commerce!");
        System.out.println("======================");
        System.out.println("Escolha a opção desejada: ");
        System.out.println("1 - Listar produtos \n" +
                "           2 - Adicionar produto ao carrinho \n" +
                "           3 - Finalizar compra");
        int opcao = input.nextInt();
        switch (opcao) {
            case 1:
                ProdutoPersistence produtos = new ProdutoPersistence();
                produtos.toString();
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }

    }
}