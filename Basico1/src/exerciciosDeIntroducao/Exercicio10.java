package exerciciosDeIntroducao;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double juros = 0.02;
		
		System.out.println("Insira o preço à vista do produto: ");
		double precoAvista = scan.nextDouble();
		
		System.out.println("Entre com o número de parcelas: ");
		int numParcelas = scan.nextInt();
		
		//juros simples
		
		double precoAPrazo = precoAvista * (1 + (juros * numParcelas));
		double valorParcela = precoAPrazo / numParcelas;
		
		System.out.printf("%nO valor de cada parcela é R$ %.2f. %n", valorParcela);
		
		scan.close();

	}

}
