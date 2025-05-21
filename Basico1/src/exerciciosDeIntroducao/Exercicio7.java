package exerciciosDeIntroducao;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		double fretePorKg = 5;
		
		System.out.println("Informe o peso da encomenda (KG): ");
		double pesoEncomenda = scan.nextDouble();
		
		double frete = pesoEncomenda * fretePorKg;
		
		System.out.printf("%nO valor do frete é de R$ %.2f %n", frete);
		
		scan.close();
	}

}
