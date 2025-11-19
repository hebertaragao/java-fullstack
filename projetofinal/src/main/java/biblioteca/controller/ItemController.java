package biblioteca.controller;

import biblioteca.model.Item;
import biblioteca.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

/**
 * Controlador REST para operações com itens da biblioteca.
 *
 * Expõe endpoints para todas as operações CRUD com itens, incluindo
 * funcionalidades específicas como filtragem por categoria.
 */
@RestController
@RequestMapping("/api/itens")
@CrossOrigin(origins = "*")
public class ItemController {
	/**
	 * Serviço para lógica de negócio de itens.
	 */
	@Autowired
	private ItemService itemService;

	/**
	 * Lista todos os itens da biblioteca.
	 *
	 * Endpoint: GET /api/itens
	 *
	 * @return Lista de todos os itens cadastrados
	 */
	@GetMapping
	public List<Item> listarTodos() {
		return itemService.listarTodos();
	}

	/**
	 * Busca um item específico por ID.
	 *
	 * Endpoint: GET /api/itens/{id}
	 *
	 * @param id ID do item a ser buscado
	 * @return ResponseEntity com o item se encontrado ou 404 se não encontrado
	 */
	@GetMapping("/{id}")
	public ResponseEntity<Item> buscarPorId(@PathVariable Long id) {
		Optional<Item> item = itemService.buscarPorId(id);
		return item.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

	/**
	 * Lista itens filtrados por categoria.
	 *
	 * Endpoint: GET /api/itens/categoria/{categoriaNome}
	 *
	 * @param categoriaNome Nome da categoria para filtrar
	 * @return Lista de itens da categoria especificada
	 */
	@GetMapping("/categoria/{categoriaNome}")
	public List<Item> listarPorCategoria(@PathVariable String categoriaNome) {
		return itemService.listarPorCategoria(categoriaNome);
	}

	/**
	 * Cria um novo item na biblioteca.
	 *
	 * Endpoint: POST /api/itens
	 *
	 * O Spring automaticamente deserializa o JSON recebido para o tipo correto de
	 * Item (Livro, Revista ou Album) baseado no campo discriminador.
	 *
	 * @param item Dados do item a ser criado
	 * @return Item criado com ID gerado
	 */
	@PostMapping
	public Item criar(@RequestBody Item item) {
		return itemService.salvar(item);
	}

	/**
	 * Atualiza um item existente.
	 *
	 * Endpoint: PUT /api/itens/{id}
	 *
	 * @param id   ID do item a ser atualizado
	 * @param item Novos dados do item
	 * @return ResponseEntity com item atualizado ou 404 se não encontrado
	 */
	@PutMapping("/{id}")
	public ResponseEntity<Item> atualizar(@PathVariable Long id, @RequestBody Item item) {
		if (itemService.buscarPorId(id).isPresent()) {
			item.setId(id);
			return ResponseEntity.ok(itemService.salvar(item));
		}
		return ResponseEntity.notFound().build();
	}

	/**
	 * Remove um item da biblioteca.
	 *
	 * Endpoint: DELETE /api/itens/{id}
	 *
	 * @param id ID do item a ser removido
	 * @return ResponseEntity com status 204 se removido ou 404 se não encontrado
	 */
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id) {
		if (itemService.buscarPorId(id).isPresent()) {
			itemService.deletar(id);
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.notFound().build();
	}
}