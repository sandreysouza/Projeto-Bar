import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char sexo;
        while (true) {
            System.out.print("Sexo (F ou M): ");
            sexo = scanner.next().toUpperCase().charAt(0);
            if (sexo == 'F' || sexo == 'M') {
                break; 
            } else {
                System.out.println("Entrada inválida! Insira 'F' para feminino ou 'M' para masculino.");
            }
        }

        int quantidadeCervejas = 0;
        while (true) {
            System.out.print("Quantidade de cervejas: ");
            if (scanner.hasNextInt()) {
                quantidadeCervejas = scanner.nextInt(); 
                break; 
            } else {
                System.out.println("Entrada inválida! Insira um número inteiro.");
                scanner.next(); 
            }
        }

        int quantidadeRefrigerantes = 0;
        while (true) {
            System.out.print("Quantidade de refrigerantes: ");
            if (scanner.hasNextInt()) {
                quantidadeRefrigerantes = scanner.nextInt(); 
                break; 
            } else {
                System.out.println("Entrada inválida! Insira um número inteiro.");
                scanner.next(); 
            }
        }

        int quantidadeEspetinhos = 0;
        while (true) {
            System.out.print("Quantidade de espetinhos: ");
            if (scanner.hasNextInt()) {
                quantidadeEspetinhos = scanner.nextInt(); 
                break; 
            } else {
                System.out.println("Entrada inválida! Insira um número inteiro.");
                scanner.next(); 
            }
        }

        Cliente cliente = new Cliente(sexo, quantidadeCervejas, quantidadeRefrigerantes, quantidadeEspetinhos);
        Conta conta = new Conta(cliente);

        RelatorioConta.gerarRelatorio(conta);

        scanner.close();
    }
}