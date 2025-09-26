package biblioteca.modelo;

import jakarta.persistence.Entity;


@Entity
public class Livro extends Item{
	
	private String editora;
	
	public Livro() {}
	
	public Livro(String titulo, String autorArtista, String categoria, String editora) {
		super(titulo, autorArtista, categoria);
		this.editora = editora;
	}
	
	public String getEditora() {return editora;}
	
	public void setEditora(String editora) {this.editora = editora;}

}
