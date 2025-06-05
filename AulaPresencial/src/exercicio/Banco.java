package exercicio;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double saldo = 1000;
		int opcao;

		while (true) {
			System.out.println("\nEscolha uma opção: ");
			System.out.println("1 - Depositar");
			System.out.println("2 - Sacar");
			System.out.println("3 - Transferir");
			System.out.println("4 - Sair");

			opcao = scan.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o valor a depositar: ");
				double deposito = scan.nextDouble();
				if (deposito > 0) {
					saldo += deposito;
					System.out.println("Deposito realizado! Saldo atual: " + saldo);
				} else {
					System.out.println("Valor inválido para depósito.");
				}
				break;

			case 2:
				System.out.println("Digite o valor a sacar: ");
				double saque = scan.nextDouble();
				if (saque > 0) {
					if (saque <= saldo) {
						saldo -= saque;
						System.out.println("Saque realizado! Saldo atual: " + saldo);
					} else {
						System.out.println("Saldo insuficiente. ");
					}
				} else {
					System.out.println("Valor inválido. ");
				}
				break;
			
			case 3:
				System.out.println("Digite o valor a transferir: ");
				double transferencia = scan.nextDouble();
				if(transferencia > 0) {
					if(transferencia <= saldo) {
						saldo -= transferencia;
						System.out.println("Transferência realizada! Salto atual: " + saldo);
					}else {
						System.out.println("Saldo insuficiente. ");
					}
				}else {
					System.out.println("Valor inválido. ");
				}
				break;
				
			case 4:
				System.out.println("Encerrando programa. ");
				
				scan.close();
				return;
			default:
				System.out.println("Opção inválida. Tente novamente.");

			}

		}

		

	}

}
