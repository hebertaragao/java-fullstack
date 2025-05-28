package operadores;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = scan.nextDouble();
		
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = scan.nextDouble();
		
		scan.nextLine();
		
		System.out.println("Insira seu nome: ");
		String nome = scan.nextLine();
		
		double media = (nota1 + nota2) / 2;
		
		System.out.printf("%n Nota 1 do Aluno: %s%n Nota 2 do Aluno: %s%n Nome do Aluno: %s%n Média do Aluno %.2fHeber%n",
				nota1, nota2, nome, media );
		
		scan.close();
		
		
		
		

	}

}
