package condicional;

import java.util.Scanner;

public class SinalDeTransito {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a cor do sinal" + "(verde, amarelo, vermelho");
		String semaforo = scan.nextLine();

		System.out.println("Existe pedestre esperando? ");
		String pedestre = scan.nextLine().toLowerCase();

		if (semaforo.equals("verde")) {
			if (pedestre.equals("sim")) {
				System.out.println("Mudar para AMARELO. Em breve, o sinal ficará VERMELHO.");
			} else {
				System.out.println("MANTER NO VERDE. Não há pedestre esperando. ");
			}
		} else if (semaforo.equals("amarelo")) {
			System.out.println("Em breve o sinal ficará VERMELHO.");
		} else if (semaforo.equals("vermelho")) {
			if (pedestre.equals("sim")) {
				System.out.println("Pedestre pode atravessar com segurança");
			} else {
				System.out.println("Mudar o sinal para VERDE. Nenhum pedestre no momento");
			}
		} else {
			System.out.println("Cor de sinal inválida");
		}

		scan.close();

	}

}
