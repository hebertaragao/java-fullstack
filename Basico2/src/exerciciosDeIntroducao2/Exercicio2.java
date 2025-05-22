package exerciciosDeIntroducao2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int numero = scan.nextInt();
		
		System.out.println("Digite outro número inteiro: ");
		int outroNumero = scan.nextInt();
		
		if(numero > outroNumero) {
			System.out.println("O primeiro número é maior que o segundo.");
		} else if (numero < outroNumero) {
			System.out.println("O segundo número é maior do que o outro.");
		}else {
			System.out.println("Os dois números são iguais");
		}
		
		scan.close();
		

	}

}
