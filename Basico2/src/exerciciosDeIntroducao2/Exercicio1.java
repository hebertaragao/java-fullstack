package exerciciosDeIntroducao2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int numero = scan.nextInt();
		
		if(numero % 2 == 00) {
			System.out.println("O número digitado é par.");
		}else {
			System.out.println("O número digitado é impar");
		}
		
		scan.close();

	}

}
