package biblioteca.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * Entidade que representa uma categoria de itens na biblioteca.
 *
 * Esta classe mapeia para a tabela 'categoria' no banco de dados e define as
 * categorias utilizadas para classificar os diferentes tipos de itens da
 * biblioteca pessoal.
 *
 * A anotação @Entity marca esta classe como uma entidade JPA. A anotação @Data
 * do Lombok gera automaticamente getters, setters, toString, equals e hashCode.
 */
@Entity
@Data
public class Categoria {
	/**
	 * Identificador único da categoria.
	 *
	 * @Id marca este campo como chave primária
	 * @GeneratedValue com IDENTITY utiliza auto-incremento do banco de dados
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	/**
	 * Nome da categoria.
	 *
	 * Este campo armazena o nome descritivo da categoria, como "Romance",
	 * "Suspense", "Rock", etc.
	 */
	private String nome;
	public void setId(Long id2) {
		// TODO Auto-generated method stub
		
	}
}
