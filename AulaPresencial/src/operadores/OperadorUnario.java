package operadores;

public class OperadorUnario {

	public static void main(String[] args) {
		
		int x =1;
		
		System.out.println(x++);
		System.out.println(x);
		System.out.println(++x);
		
		
		int y = 2;
		
		System.out.println(--y);
		System.out.println(y);
		System.out.println(y--);
		System.out.println(y);
		
		
		int a = 10;
		int b = 20;
		
		System.out.println(a++ + --b + ++a - b--);
		

	}

}
