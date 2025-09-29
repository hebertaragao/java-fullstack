package biblioteca.repository;

import biblioteca.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * Interface de repositório para operações com a entidade Item.
 *
 * Além dos métodos CRUD básicos herdados de JpaRepository, esta interface
 * define métodos customizados para consultas específicas do domínio.
 *
 * @Repository é opcional aqui pois JpaRepository já é reconhecido como um
 *             componente Spring, mas pode ser usado para clareza.
 */
@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
	/**
	 * Busca itens por nome da categoria.
	 *
	 * Este método utiliza a convenção de nomenclatura do Spring Data JPA para gerar
	 * automaticamente a consulta SQL correspondente.
	 *
	 * A consulta gerada será equivalente a: SELECT i FROM Item i WHERE
	 * i.categoria.nome = :categoriaNome
	 *
	 * @param categoriaNome Nome da categoria para filtrar os itens
	 * @return Lista de itens que pertencem à categoria especificada
	 */
	List<Item> findByCategoriaNome(String categoriaNome);
}
