package exerciciosDeIntroducao2;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o preço do produto: ");
		double preco = scan.nextDouble();
		System.out.println("Digite a forma de pagamento ( 1 - à vista, 2 - no cartão de crédito, 3 - no cartão de débito): ");
		int formaPagamento = scan.nextInt();
		
		double valorFinal;
		
		if (formaPagamento == 1) {
		    valorFinal = preco * 0.9; // 10% de desconto
		} else if (formaPagamento == 3) {
		    valorFinal = preco * 0.95; // 5% de desconto
		} else if (formaPagamento == 2) {
		    valorFinal = preco; // preço cheio
		} else {
		    System.out.println("Forma de pagamento inválida.");
		    scan.close();
		    return;
		}
		
		System.out.println("Valor final da compra: R$" + valorFinal);

		scan.close();
	}

}
