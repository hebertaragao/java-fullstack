package exerciciosDeIntroducao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int qtdLitros;
		double contaAgua, valorLitro = 0.02;
		
		
		System.out.println("Informe a quantidade de litros consumidos: ");
		qtdLitros = scan.nextInt();
		
		contaAgua = valorLitro * qtdLitros;
		
		System.out.printf("%nO valor da conta de água é de R$: %.2f %n", contaAgua);
		
		scan.close();

	}

}
