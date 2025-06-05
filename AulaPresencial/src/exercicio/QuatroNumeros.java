package exercicio;

import java.util.Scanner;

public class QuatroNumeros {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num1, num2, num3, num4;
		
		System.out.println("Digite quatro números inteiros: ");
		
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		num4 = scan.nextInt();
		
		int maior = num1;
		int menor = num1;
		
		if (num2 > maior) {
			maior = num2;
		}
		if (num2 < menor) {
            menor = num2;
        }

        if (num3 > maior) {
            maior = num3;
        }
        if (num3 < menor) {
            menor = num3;
        }

        if (num4 > maior) {
            maior = num4;
        }
        if (num4 < menor) {
            menor = num4;
        }
        
        int diferenca = maior - menor;
        
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        System.out.println("A diferença entre eles é: " + diferenca);

		

		scan.close();

	}

}
