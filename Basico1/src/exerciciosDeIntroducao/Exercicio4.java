package exerciciosDeIntroducao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o número de horas trabalhadas: ");
		int horastrabalhadas = scan.nextInt();
		
		System.out.println("Entre com o valor por hora de trabalho: ");
		double valorHora = scan.nextDouble();
		
		double salarioBruto = horastrabalhadas * valorHora;
		
		System.out.printf("5nO salário bruto deste funcionário é de R$ %.2f", salarioBruto);
		
		scan.close();

	}

}
