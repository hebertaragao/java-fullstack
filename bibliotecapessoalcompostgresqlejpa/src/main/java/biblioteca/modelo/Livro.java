package biblioteca.modelo;

public class Livro extends Item{
	
	private String isbn;
	private int numeroPaginas;
	
	public Livro(String titulo, String autorArtista, Categoria categoria, String isbn, int numeroPaginas) {
		super(titulo, autorArtista, categoria);
		this.isbn = isbn;
		this.numeroPaginas = numeroPaginas;
	}
	
	// Getters e Setters
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + "ISBN: " + isbn + "\n" + "Numero de Páginas: " + numeroPaginas;
	}

}
