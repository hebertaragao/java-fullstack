package exerciciosDeIntroducao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o seu nome: ");
		String nome = scan.nextLine();
		System.out.printf("%nOlá, %s! Bem-vindo(a) ao nosso programa!%n", nome);
		
		scan.close();

	}

}
