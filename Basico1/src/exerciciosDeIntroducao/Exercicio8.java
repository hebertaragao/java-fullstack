package exerciciosDeIntroducao;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a cotação do dólar: ");
		double cotacaoDolar = scan.nextDouble();
		
		System.out.println("Informe o valor a ser convertido: ");
		double valorEmReais = scan.nextDouble();
		
		double valorConvertido = valorEmReais / cotacaoDolar;
		
		System.out.printf("%nO valor de R$ %.2f equivale a US$ %.2f %n", valorEmReais, valorConvertido);
		
		scan.close();

	}

}
