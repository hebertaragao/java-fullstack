package condicional;

import java.util.Scanner;


public class Iguais {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro número");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo número");
		int num2 = scan.nextInt();

		
		System.out.println("Digite o terceiro número");
		int num3 = scan.nextInt();

		if (num1 == num2 && num1 == num3) {
			System.out.println("Todos os número são iguais");
			
		}else if(num1 == num2 || num1 == num3 || num2 == num3) {
			System.out.println("Apenas dois números são iguais");
			
		}else {
			System.out.println("Todos os números são diferentes");
		}

	}

}
