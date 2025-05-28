package operadores;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		
		int valor1 = 8;
		int valor2 = 3;
		
		int soma = valor1 + valor2;
		System.out.println("Soma: " + soma);
		
		int subtração = valor1 - valor2;
		System.out.println("Subtração: " + subtração);
		
		int multiplicacao = valor1 * valor2;
		System.out.println("Multiplicação: " + multiplicacao);
		
		double divisao = (double) valor1 / valor2;
		System.out.printf("Divisão: %.2f%n", divisao);
		
		int resto = valor1 % valor2;
		System.out.println("Resto: " + resto);
		 

	}

}
