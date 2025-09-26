package biblioteca.modelo;

import jakarta.persistence.Entity;

@Entity
public class AlbumMusica extends Item{
	
	private Integer anoLancamento;
	
	public AlbumMusica() {}
	
	public AlbumMusica(String titulo, String autorArtista, String categoria, Integer anoLancamento) {
		super(titulo, autorArtista, categoria);
		this.anoLancamento = anoLancamento;
	}
	
	public Integer getAnoLancamento() {return anoLancamento;}
	
	public void setAnoLancamento(Integer anoLancamento) {this.anoLancamento = anoLancamento;}
	

}
