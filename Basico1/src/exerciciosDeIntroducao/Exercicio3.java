package exerciciosDeIntroducao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a distância percorrida (Km): ");
		int distanciaEmKm = scan.nextInt();
		
		System.out.println("Entre com o tempo gasto (Horas: ");
		int tempoGastoEmHoras = scan.nextInt();
		
		int distanciaEmMetros = distanciaEmKm * 1000;
		
		int tempoEmSegundos = tempoGastoEmHoras * 3600;
		
		double velocidadeMedia = (double) distanciaEmMetros / tempoEmSegundos;
		
		System.out.printf("%nA velocidade média é de %.2f m/s.", velocidadeMedia);
		
		scan.close();

	}

}
