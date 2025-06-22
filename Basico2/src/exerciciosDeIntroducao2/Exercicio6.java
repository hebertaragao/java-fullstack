package exerciciosDeIntroducao2;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int numero1, numero2;
		char operador;
		
		System.out.println("Digite o primeiro número: ");
		numero1 = scan.nextInt();
		System.out.println("Digite o segundo número: ");
		numero2 = scan.nextInt();
		System.out.println("Digite o oeprador aritmético ( +, -, *, /): ");
		operador = scan.next().charAt(0);
		
		if (operador == '+') {
			System.out.println(numero1 + numero2);
		}else if(operador == '-') {
			System.out.println(numero1 - numero2);
		}else if(operador == '*') {
			System.out.println(numero1 * numero2);
		}else if (operador == '/') {
			System.out.println(numero1 / numero2);
		}else {
			System.out.println("Operador inválido");
		}

		scan.close();

	}

}
