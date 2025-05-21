package exerciciosDeIntroducao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double valorEmprestimo, taxaJuros, valorTotal, valorParcela;
		int qtdMeses;
		
		System.out.println("Entre com o valor do empréstimo: ");
		valorEmprestimo = scan.nextDouble();
		
		System.out.println("Qual a taxa de juros mensal? ");
		taxaJuros = scan.nextDouble();
		
		System.out.println("O empréstimo foi em quantos meses? ");
		qtdMeses = scan.nextInt();
		
		// calculo dos juros simples
		
		valorTotal = valorEmprestimo + (valorEmprestimo * (taxaJuros / 100) * qtdMeses);
		valorParcela = valorTotal / qtdMeses;
		
		System.out.printf("%nO valor total com juros é de R$ %.2f %n", valorTotal);
		System.out.printf("%nO valor de cada parcela será de R$ %.2f %n", valorParcela);
		
		scan.close();

	}

}
