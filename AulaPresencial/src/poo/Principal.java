package poo;

public class Principal {

	public static void main(String[] args) {
		
		Carro meuCarro = new Carro();
		
		
		meuCarro.marca = "BYD";
		meuCarro.modelo = "KING";
		meuCarro.ano = 2025;
		meuCarro.cor = "Preto";
		
		System.out.println(meuCarro.marca);
		System.out.println(meuCarro.modelo);
		System.out.println(meuCarro.ano);
	}

}
