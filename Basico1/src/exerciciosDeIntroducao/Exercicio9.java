package exerciciosDeIntroducao;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double alturaParede, larguraParede, qtdeTinta;
		
		System.out.println("Entre com a altura da parede (m): ");
		alturaParede = scan.nextDouble();
		
		System.out.println("Entre com a largura da parede (m): ");
		larguraParede = scan.nextDouble();
		
		double areaParede = alturaParede * larguraParede;
		qtdeTinta = areaParede / 2;
		
		System.out.printf("%nA área da parede é de %.2f m² %n", areaParede);
		System.out.printf("%nA quantidade de tinta necessária é de %.2f litors. %n", qtdeTinta);
		
		scan.close();
	}

}
