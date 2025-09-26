package biblioteca.aplicacao;

import biblioteca.modelo.*;
import biblioteca.servico.ItemService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.Http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/itens")
public class ItemController {
	
	@Autowires
	private ItemService service;
	
	@PostMapping("/livro")
	public Item adicionarLivro(@Valid @RequestBody Livro livro) {
		return service.adicionarLivro(livro);
	}
	
	@PostMapping("/revista")
	public Item adicionarRevista(@Valid @RequestBody Revista revista) {
		return service.adicionarRevista(revista);
	}
	
	@PostMapping("/album")
	public Item adicionarAlbum(@Valid @RequestBody Album album) {
		return service.adicionarAlbum(album);
	}
	
	@GetMapping
	public List<Item> listarTodos(){
		return service.listarTodos();
	}
	
	@GetMapping("/categoria/{categoria}")
	public List<Item> listarPorCategoria(@PathVariable String categoria){
		return service.listarPorCategoria(categoria);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> remover(@PathVariable Long id){
		Optional<Item> item = service.encontrarPorId(id);
		if(item.isPresent()) {
			service.remover(id);
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
	}

}
