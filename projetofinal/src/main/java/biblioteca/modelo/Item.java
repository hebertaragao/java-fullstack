package biblioteca.modelo;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Item {
	
	@Id
	@GenerateddValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Título é obrigatório")
	private String titulo;
	
	@NotBlank(message = "Autor/Artista é obrigatório")
	private String autorArtista;
	
	@NotBlank(message = "Categoria é obrigatório")
	private String categoria;
	
	protected Item() {}
	
	protected Item(String titulo, String autorArtista, String categoria){
		this.titulo = titulo;
		this.autorArtista = autorArtista;
		this.categoria = categoria;
		
	}
	
	public Long getId() {return id;}
	
	public String getTitulo() { return titulo;}
	
	public void setTitulo(String titulo) {this.titulo = titulo;}
	
	public String getAutorArtista() {return autorArtista;}
	
	public void setAutorArtista(String autorArtista) {this.autorArtista = autorArtista;}
	
	public String getCategoria() {return categoria;}
	
	public void setCategoria(String categoria) {this.categoria = categoria;}
	
	
	
	
	
	

}
