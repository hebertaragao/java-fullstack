package exerciciosDeIntroducao2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome da pessoa:");
		String nome = scan.nextLine();
		System.out.println("Digite a idade da pessoa: ");
		int idade = scan.nextInt();
		
		String situacao;
		if(idade >= 18 && idade <= 70) {
			situacao = "deve votar";
		} else if (idade >= 16 && idade <=17 || idade > 70) {
			situacao = "pode votar, mas é facultativo";
		}else {
			situacao = "não pode votar";
		}
		System.out.println(nome + " " + situacao);
		

		scan.close();
		
		

	}

}
