package exercicio;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		String[] opcoes = {"Pedra", "Papel", "Tesoura"};
		System.out.println("Escolha: Pedra, Papel ou Tesoura?");
		String escolhaJogador = scan.nextLine();
		
		int indiceComputador = random.nextInt(3);
		String escolhaComputador = opcoes[indiceComputador];
		
		System.out.println("O Computaodr escolheu: " + escolhaComputador);
		
		if(escolhaJogador.equalsIgnoreCase(escolhaComputador)) {
			System.err.println("Empate!");
		} else if ((escolhaJogador.equalsIgnoreCase("Pedra") && escolhaComputador.equals("Tesoura")) ||
                (escolhaJogador.equalsIgnoreCase("Papel") && escolhaComputador.equals("Pedra")) ||
                (escolhaJogador.equalsIgnoreCase("Tesoura") && escolhaComputador.equals("Papel"))) {
         System.out.println("Você ganhou!");
		} else {
			System.out.println("Você perdeu!");
		}
		scan.close();

	}

}
