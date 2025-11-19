package biblioteca.service;

import biblioteca.model.Item;
import biblioteca.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

/**
 * Serviço responsável pela lógica de negócio relacionada a itens.
 *
 * Centraliza todas as operações relacionadas ao gerenciamento de itens da
 * biblioteca, implementando validações e regras de negócio específicas.
 */
@Service
public class ItemService {
	/**
	 * Repositório para operações de persistência com itens.
	 */
	@Autowired
	private ItemRepository itemRepository;

	/**
	 * Lista todos os itens cadastrados na biblioteca.
	 *
	 * @return Lista contendo todos os itens, independente do tipo
	 */
	public List<Item> listarTodos() {
		return itemRepository.findAll();
	}

	/**
	 * Busca um item específico por seu ID.
	 *
	 * @param id Identificador único do item
	 * @return Optional contendo o item se encontrado, vazio caso contrário
	 */
	public Optional<Item> buscarPorId(Long id) {
		return itemRepository.findById(id);
	}

	/**
	 * Salva um item no banco de dados.
	 *
	 * Este método funciona para todos os tipos de itens (Livro, Revista, Album)
	 * devido ao polimorfismo implementado através da herança JPA.
	 *
	 * @param item Item a ser salvo (pode ser Livro, Revista ou Album)
	 * @return Item salvo com ID atualizado
	 */
	public Item salvar(Item item) {
// Aqui poderiam ser implementadas validações de negócio
// como verificação de duplicatas, validação de dados específicos, etc.
		return itemRepository.save(item);
	}

	/**
	 * Remove um item do sistema.
	 *
	 * @param id ID do item a ser removido
	 */
	public void deletar(Long id) {
		itemRepository.deleteById(id);
	}

	/**
	 * Lista itens filtrados por categoria.
	 *
	 * Este método utiliza o método customizado do repositório para buscar apenas
	 * itens que pertencem a uma categoria específica.
	 *
	 * @param categoriaNome Nome da categoria para filtrar
	 * @return Lista de itens da categoria especificada
	 */
	public List<Item> listarPorCategoria(String categoriaNome) {
		return itemRepository.findByCategoriaNome(categoriaNome);
	}
}