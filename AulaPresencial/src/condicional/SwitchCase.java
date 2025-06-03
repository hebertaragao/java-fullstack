package condicional;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número entre 1 e 7: ");
		int numero = scan.nextInt();
		
		switch (numero) {
		case 1:
			System.out.println("É dommingo");
		break;
		
		case 2:
			System.out.println("É segunda");
		break;
		case 3:
			System.out.println("É terça-feira");
		break;
		case 4:
			System.out.println("É quarta-feira");
		break;
		case 5:
			System.out.println("É quinta-feira");
		break;
		case 6:
			System.out.println("É sexta-feira");
		break;
		case 7:
			System.out.println("É sábado");
		break;
		default:
			System.out.println("Opção inválida informe um número entre 1 a 7:");
		}
		
		scan.close();

	}

}
