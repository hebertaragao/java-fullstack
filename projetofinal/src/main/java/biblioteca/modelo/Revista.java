package biblioteca.modelo;

import jakarta.persistence.Entity;

@Entity
public class Revista {

	private Integer edicao;

	public Revista() {
	}

	public Revista(String titulo, String autorArtista, String categoria, Integer edicao) {
		super(titulo, autorArtista, categoria);
		this.edicao = edicao;
	}

	public Integer getEdicao() {
		return edicao;
	}

	public void setEdicao(Integer edicao) {
		this.edicao = edicao;

	}
}
