package biblioteca.modelo;

import java.time.LocalDate;

public class Revista extends Item {

	private String editora;
	private LocalDate dataPublicacao;

	public Revista(String titulo, String autorArtista, Categoria categoria, String editora, LocalDate dataPublicacao) {
		super(titulo, autorArtista, categoria);
		this.editora = editora;
		this.dataPublicacao = dataPublicacao;
	}

	// Getters e Setters

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(LocalDate dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "Editora: " + editora + "\n" + "Data de Publicação: " + dataPublicacao;
	}

}
