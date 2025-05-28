package operadores;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		double valor1 = 17;
		double valor2 = 18;
		
		System.out.println(valor1 >= valor2 || valor1 < valor2);
		
		System.out.println(valor1 >= valor2 && valor1 < valor2);
		
		System.out.println(!(valor1 >= valor2) && valor1 < valor2);
		
		System.out.println(!(valor1 >= valor2 && valor1 < valor2));

	}

}
