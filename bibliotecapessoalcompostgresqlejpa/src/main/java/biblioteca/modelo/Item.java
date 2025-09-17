package biblioteca.modelo;

import java.time.LocalDate;

public abstract class Item {
	protected int id;
	protected String titulo;
	protected String autorArtista;
	protected Categoria categoria;
	protected LocalDate dataCadastro;

	public Item(String titulo, String autorArtista, Categoria categoria) {
		this.titulo = titulo;
		this.autorArtista = autorArtista;
		this.categoria = categoria;
		this.dataCadastro = LocalDate.now();
	}

// Getters e Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutorArtista() {
		return autorArtista;
	}

	public void setAutorArtista(String autorArtista) {
		this.autorArtista = autorArtista;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", Título: \'" + titulo + "\'\n" + "Autor/Artista: \'" + autorArtista + "\'\n"
				+ "Categoria: " + (categoria != null ? categoria.getNome() : "N/A") + "\n" + "Data de Cadastro: "
				+ dataCadastro;
	}
}
