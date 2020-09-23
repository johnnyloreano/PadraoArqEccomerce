// Cadastro de cliente (nome, cpf, endereço) - só inclusão;
// Cadastro de produto (id, nome do produto, quantidade) - só inclusão;
// Compra de um produto:
// o cliente deve ser capaz de escolher produtos e suas respectivas quantidades;
// ao finalizar a compra o cliente deve receber o resultado final da compra e solicitar a geração de um boleto para efetuar o pagamento.

package Main;

import DataLayer.BoletoModel;
import DataLayer.ClienteModel;
import DataLayer.ProdutoModel;
import PersistenceLayer.ClientePersistence;
import PersistenceLayer.ProdutoPersistence;

import java.awt.peer.SystemTrayPeer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Terminal {
    private static ClienteModel user;
    private static BoletoModel boleto;

    public static void main(String[] args) {
//        user = login();
        getMenu();
    }

//    public static ClienteModel login() {
//        Scanner input = new Scanner((System.in));
//        System.out.println("Sistema de E-Commerce!");
//        System.out.println("======================");
//        System.out.println("Insira seu cpf: ");
//
//        ClientePersistence clientes = new ClientePersistence();
//
//        String cpf = input.nextLine();
//        user = clientes.getClienteByCPF(cpf);
//
//        return user;
//    }

    public static void getMenu() {

        ClientePersistence clientes = new ClientePersistence();
        ClienteModel cli = null;

        ProdutoPersistence produtos = new ProdutoPersistence();
        List<ProdutoModel> listaProduto = new ArrayList<ProdutoModel>();

        // Carrinho carrinho = new Carrinho();

        Scanner input = new Scanner((System.in));
        System.out.println("Sistema de E-Commerce!");
        System.out.println("======================");
        int opcao = -1;

        System.out.println("\nCadastro de cliente: \nDigite o CPF do cliente | 0 - para sair.");
        clientes.printClientList();

        while(opcao != 99) {

            opcao = input.nextInt();

            switch (opcao) {
                case 123:
                    cli = clientes.getClienteByCPF("123");
                    opcao = 99;
                    break;
                case 855:
                    cli = clientes.getClienteByCPF("855");
                    opcao = 99;
                    break;
                case 902:
                    cli = clientes.getClienteByCPF("902");
                    opcao = 99;
                    break;
                case 012:
                    cli = clientes.getClienteByCPF("012");
                    opcao = 99;
                    break;
                case 321:
                    cli = clientes.getClienteByCPF("321");
                    opcao = 99;
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("CPF inválido! Tente novamente.");
                    break;
            }
        }

        System.out.println("\nDigite: \n1 - Cadastrar produtos | 0 - Sair.");

        while(opcao != 98) {

            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    produtos.printProductList();
                    opcao = 98;
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("CPF inválido! Tente novamente.");
                    break;
            }
        }


        while(opcao != 0) {
            System.out.println("\nEscolha a opção desejada: ");
            System.out.println(
                    "1 - Adicionar produto ao carrinho | " +
                    "9 - Finalizar compra | " +
                    "0 - Sair"
            );

            opcao = input.nextInt();

            switch (opcao) {


                case 1:
                    while(opcao != 9) {
                        produtos.printProduct();
                        System.out.println("9 - Finalizar compra | " + "0 - Sair");
                        opcao = input.nextInt();

                        switch (opcao) {
                            case 1:
                                listaProduto.add(produtos.getProdutoByID(1));
                                break;
                            case 2:
                                listaProduto.add(produtos.getProdutoByID(2));
                                break;
                            case 3:
                                listaProduto.add(produtos.getProdutoByID(3));
                                break;
                            case 9:
                                opcao = 9;
                            default:
                                System.out.println("Opção inválida! Tente novamente.");
                                break;
                        }
                    }

                case 9:
                    int total = 0;
                    System.out.println("\n==== BOLETO ====" + " | NFs: 0001" + cli.getCpf() +
                            "\nCliente: " + cli.getNome() + " | CPF: " + cli.getCpf() +
                            "\n\n==== PRODUTOS");

                    for(ProdutoModel p : listaProduto) {
                        System.out.println("Produto: " + p.getNome() + " | Valor: R$ " + p.getValor());
                    }

                    System.out.println("\n==== TOTAL A PAGAR");
                    for(ProdutoModel p : listaProduto) {
                        total += p.getValor();
                    }
                    System.out.println("R$ " + total);

                    opcao = 0;
                    break;

                case 0:
                    System.exit(0);
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }


    }
}