package biblioteca.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Entidade que representa um álbum musical na biblioteca.
 *
 * Estende Item com campos específicos para álbuns musicais, como gravadora e
 * número de faixas.
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Album extends Item {
	/**
	 * Nome da gravadora responsável pelo álbum.
	 *
	 * Campo opcional que identifica a empresa discográfica responsável pela
	 * produção e distribuição do álbum.
	 */
	private String gravadora;
	/**
	 * Número total de faixas do álbum.
	 *
	 * Campo opcional que indica quantas músicas o álbum contém, útil para
	 * catalogação completa.
	 */
	private int numeroFaixas;
}
