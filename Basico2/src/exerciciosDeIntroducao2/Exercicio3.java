package exerciciosDeIntroducao2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = scan.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		double nota3 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		String situacao = "";
		
		if(media >= 7) {
			situacao = "Aprovado!";
		}else if(media >=4 && media <7) {
			situacao = "Recuperação!";
		}else if(media ==4) {
			situacao = "Reprovado!";
		}else {
			situacao = "Prova final!";
		}
		
		System.out.printf("%nSituaçao do Aluno: %s", situacao);
		
		scan.close();
		
	}

}
