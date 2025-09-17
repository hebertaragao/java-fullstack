package biblioteca.modelo;

public class AlbumMusica extends Item {

	private String genero;
	private int numeroFaixas;

	public AlbumMusica(String titulo, String autorArtista, Categoria categoria, String genero, int numeroFaixas) {
		super(titulo, autorArtista, categoria);
		this.genero = genero;
		this.numeroFaixas = numeroFaixas;
	}

	// Getters e Setters

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getNumeroFaixas() {
		return numeroFaixas;
	}

	public void setNumeroFaixas(int numeroFaixas) {
		this.numeroFaixas = numeroFaixas;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "Gênero: " + genero + "\n" + "Número de Faixas: " + numeroFaixas;
	}

}
