package exerciciosDeIntroducao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o preço do primeiro produto: ");
		double produto1 = scan.nextDouble();
		
		System.out.println("Entre com o preço do segundo produto: ");
		double produto2 = scan.nextDouble();
		
		double valorTotal = produto1 + produto2;
		
		System.out.printf("%nO valor total é de R$ %.2f.", valorTotal);
		
		scan.close();

	}

}
