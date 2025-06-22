package exerciciosDeIntroducao2;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o mês (1 a 12): ");
		int mes = scan.nextInt();
		
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			System.out.println("O mês " + mes + " tem 31 dias.");
		}else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			System.out.println("O mês " + mes + " tem 30 dias.");
		}else
			System.out.println("O mês " + mes + " tem 28 dias.");

		scan.close();
	}

}
