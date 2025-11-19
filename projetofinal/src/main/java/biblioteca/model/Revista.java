package biblioteca.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Entidade que representa uma revista ou periódico na biblioteca.
 *
 * Estende Item com campos específicos para publicações periódicas, como editora
 * e número da edição.
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Revista extends Item {
	/**
	 * Nome da editora responsável pela publicação.
	 *
	 * Campo opcional que identifica a empresa ou organização responsável pela
	 * publicação da revista.
	 */
	private String editora;
	/**
	 * Número da edição da revista.
	 *
	 * Campo opcional que identifica a edição específica, útil para colecionadores e
	 * referências precisas.
	 */
	private int edicao;
}
