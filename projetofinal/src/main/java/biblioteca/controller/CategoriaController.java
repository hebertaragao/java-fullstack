package biblioteca.controller;

import biblioteca.model.Categoria;
import biblioteca.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

/**
 * Controlador REST para operações com categorias.
 *
 * Este controlador expõe endpoints HTTP que permitem ao frontend realizar
 * operações CRUD com categorias através de APIs REST.
 *
 * @RestController combina @Controller e @ResponseBody, indicando que todos os
 *                 métodos retornam dados diretamente (não views)
 *
 * @RequestMapping define o prefixo base para todas as rotas deste controlador
 *
 * @CrossOrigin permite requisições de qualquer origem (necessário para
 *              comunicação entre frontend e backend em domínios diferentes)
 */
@RestController
@RequestMapping("/api/categorias")
@CrossOrigin(origins = "*")
public class CategoriaController {
	/**
	 * Serviço para lógica de negócio de categorias.
	 */
	@Autowired
	private CategoriaService categoriaService;

	/**
	 * Lista todas as categorias.
	 *
	 * Endpoint: GET /api/categorias
	 *
	 * @return Lista de todas as categorias cadastradas
	 */
	@GetMapping
	public List<Categoria> listarTodas() {
		return categoriaService.listarTodas();
	}

	/**
	 * Busca uma categoria específica por ID.
	 *
	 * Endpoint: GET /api/categorias/{id}
	 *
	 * @param id ID da categoria a ser buscada
	 * @return ResponseEntity com a categoria se encontrada (200) ou 404 se não
	 *         encontrada
	 */
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> buscarPorId(@PathVariable Long id) {
		Optional<Categoria> categoria = categoriaService.buscarPorId(id);
		return categoria.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

	/**
	 * Cria uma nova categoria.
	 *
	 * Endpoint: POST /api/categorias
	 *
	 * @param categoria Dados da categoria a ser criada (enviados no corpo da
	 *                  requisição)
	 * @return Categoria criada com ID gerado
	 */
	@PostMapping
	public Categoria criar(@RequestBody Categoria categoria) {
		return categoriaService.salvar(categoria);
	}

	/**
	 * Atualiza uma categoria existente.
	 *
	 * Endpoint: PUT /api/categorias/{id}
	 *
	 * @param id        ID da categoria a ser atualizada
	 * @param categoria Novos dados da categoria
	 * @return ResponseEntity com categoria atualizada (200) ou 404 se não
	 *         encontrada
	 */
	@PutMapping("/{id}")
	public ResponseEntity<Categoria> atualizar(@PathVariable Long id, @RequestBody Categoria categoria) {
		if (categoriaService.buscarPorId(id).isPresent()) {
			categoria.setId(id);
			return ResponseEntity.ok(categoriaService.salvar(categoria));
		}
		return ResponseEntity.notFound().build();
	}

	/**
	 * Remove uma categoria.
	 *
	 * Endpoint: DELETE /api/categorias/{id}
	 *
	 * @param id ID da categoria a ser removida
	 * @return ResponseEntity com status 204 (No Content) se removida ou 404 se não
	 *         encontrada
	 */
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id) {
		if (categoriaService.buscarPorId(id).isPresent()) {
			categoriaService.deletar(id);
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.notFound().build();
	}
}
