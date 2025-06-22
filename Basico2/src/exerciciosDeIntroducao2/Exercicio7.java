package exerciciosDeIntroducao2;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escolha uma letra: ");
		String letra = scan.next().toLowerCase();
		
		if(letra.equals("a") ||
				letra.equals("e") ||
				letra.equals("i") ||
				letra.equals("o") ||
				letra.equals("u")) {
			System.out.println("Vogal");
		}else {
			System.out.println("Consoante");
		}

		scan.close();
	}

}
