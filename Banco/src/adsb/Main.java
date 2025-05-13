package adsb;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<CartaoCredito> cartoes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    
    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n=== SISTEMA DE BANCO ===");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Cadastrar Cartao");
            System.out.println("3. Listar Cartoes");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer
        
            switch (opcao) {
            case 1:
                cadastrarCliente();
                break;
            case 2:
                cadastrarCartao();
                break;
            case 3:
                listarCartao();
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    } while (opcao != 0);
}
    
    private static void cadastrarCliente() {
        System.out.print("Nome do Cliente: ");
        String nome = scanner.nextLine();
        System.out.print("idade: ");
        String idade = scanner.nextLine();
        clientes.add(new Cliente(nome, idade));
        System.out.println("Cliente cadastrado com sucesso!");
    }
    
    private static void cadastrarCartao() {
        if (clientes.isEmpty()) {
            System.out.println("Cadastre clientes primeiro!");
            return;
        }

        System.out.println("Clientes disponíveis:");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println((i + 1) + ". " + clientes.get(i));
        }

        System.out.print("Escolha o número do cliente: ");
        int clienteIndex = scanner.nextInt() - 1;
        scanner.nextLine(); // Limpar buffer

        System.out.print("Numero do cartao: ");
        String numero = scanner.nextLine();
        System.out.print("Validade: ");
        String val = scanner.nextLine();

        cartoes.add(new CartaoCredito(numero, val, clientes.get(clienteIndex)));
        System.out.println("Cartao cadastrado com sucesso!");
    }
    
    private static void listarCartao() {
        System.out.println("\n=== CARTOES ATIVOS ===");
        for (CartaoCredito car : cartoes) {
            System.out.println(car + "\n");
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}	
        
        