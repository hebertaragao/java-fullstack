package biblioteca.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToOne;
//import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * Classe abstrata que representa um item genérico da biblioteca.
 *
 * Esta classe serve como base para todos os tipos específicos de itens (livros,
 * revistas, álbuns) e contém aos atributos comuns a todos eles.
 *
 * A estratégia de herança JOINED cria uma tabela para a classe pai e tabelas
 * separadas para cada subclasse, mantendo normalização adequada.
 *
 * @Entity marca como entidade JPA
 * @Inheritance define a estratégia de herança
 * @Data gera métodos básicos automaticamente
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
public abstract class Item {
	/**
	 * Identificador único do item.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	/**
	 * Título do item.
	 *
	 * @NotBlank garante que o campo não seja nulo nem vazio
	 */
	@NotBlank(message = "O título é obrigatório")
	private String titulo;
	/**
	 * Nome do autor (para livros/revistas) ou artista (para álbuns).
	 *
	 * Este campo é flexível para acomodar diferentes tipos de criadores de
	 * conteúdo, desde autores individuais até bandas e coletivos.
	 */
	@NotBlank(message = "O autor/artista é obrigatório")
	private String autorArtista;
	/**
	 * Categoria à qual o item pertence.
	 *
	 * @ManyToOne define relacionamento muitos-para-um com Categoria Múltiplos itens
	 *            podem pertencer à mesma categoria
	 */
	@ManyToOne
	private Categoria categoria;
	public void setId(Long id2) {
		// TODO Auto-generated method stub
		
	}
}
