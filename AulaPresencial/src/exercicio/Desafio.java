package exercicio;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int num2 = scan.nextInt();
		
		System.out.println("Digite o terceiro numero:");
		int num3 = scan.nextInt();
		
		System.out.println("Digite o quarto numero: ");
		int num4 = scan.nextInt();
		
		int maior;
		
		if(num1 > num2 && num1 > num3 && num1 > num4) {
			System.out.println("O número " + num1 + " é maior ");
			maior = num1;
			
		}else if(num2 > num1 && num2 > num3 && num2 > num4) {
			System.out.println("O número " + num2 + " é maior ");
			maior = num2;
			
		}else if (num3 > num1 && num3 > num2 && num3 > num4) {
			System.out.println("O número " + num3 + " é maior ");
			maior = num3;
		}else {
			System.out.println("O número " + num4 + " é maior ");
			maior = num4;
		}
		
		int menor;
		
		if(num1 < num2 && num1 < num3 && num1 < num4) {
			System.out.println("O número " + num1 + " é menor ");
			menor = num1;
			
		}else if(num2 < num1 && num2 < num3 && num2 < num4) {
			System.out.println("O número " + num2 + " é menor ");
			menor = num2;
			
		}else if (num3 < num1 && num3 < num2 && num3 < num4) {
			System.out.println("O número " + num3 + " é menor ");
			menor = num3;
			
		}else {
			System.out.println("O número " + num4 + " é menor ");
			menor = num4;
		}
		int diferenca = maior - menor;
		System.out.println("A diferença entre o maior e o menor é de: " + diferenca);
		
		
		scan.close();
		
	}

}
