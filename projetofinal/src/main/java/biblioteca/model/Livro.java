package biblioteca.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Entidade que representa um livro na biblioteca.
 *
 * Esta classe estende Item adicionando campos específicos para livros, como
 * ISBN e número de páginas. A herança permite reutilização dos campos comuns
 * definidos na classe pai.
 *
 * @EqualsAndHashCode(callSuper = true) inclui campos da classe pai nos métodos
 *                              equals e hashCode gerados pelo Lombok.
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Livro extends Item {
	/**
	 * Código ISBN do livro.
	 *
	 * Campo opcional que pode conter ISBN-10 ou ISBN-13, útil para identificação
	 * única de publicações.
	 */
	private String isbn;
	/**
	 * Número total de páginas do livro.
	 *
	 * Campo opcional que ajuda na catalogação e pode ser útil para estimativas de
	 * tempo de leitura.
	 */
	private int numeroPaginas;
}
