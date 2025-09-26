package biblioteca.servico;

import biblioteca.modelo.Item;
import biblioteca.repositorio.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {
	
	@Autoeired
	private ItemRepository repository;
	
	
	public Item adicionar(Item item) {
		return repository.save(item);
	}
	
	public List<Item> listarTodos(){
		return repository.findAll();
	}
	
	public List<Item> listarPorCategoria(String categoria){
		return repository.findByCategoria(categoria);
	}
	
	public void remover(Long id) {
		repository.deleteById(id);
	}
	
	public Optional<Item> encontrarPorId(Long id){
		return repository.findById(id);
	}

}
