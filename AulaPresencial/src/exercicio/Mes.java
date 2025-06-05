package exercicio;

import java.util.Scanner;

public class Mes {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número entre 1 e 12: ");
		int numero = scan.nextInt();
		
		switch(numero) {
		
		case 1, 2, 3:
			System.out.println("Primeiro trimestre.");
		break;
		
		case 4, 5, 6:
			System.out.println("Segundo trimestre.");
		break;
		
		case 7, 8, 9:
			System.out.println("Terceiro trimestre.");
		break;
		
		case 10, 11, 12:
			System.out.println("Quarto trimestre.");
		break;
		
		default:
			System.out.println("Valor inválido ");
		}
		
		scan.close();

	}

}
