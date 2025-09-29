package biblioteca.service;

import biblioteca.model.Categoria;
import biblioteca.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

/**
 * Serviço responsável pela lógica de negócio relacionada a categorias.
 *
 * Esta classe atua como uma camada intermediária entre os controladores e os
 * repositórios, implementando regras de negócio e coordenando operações
 * complexas quando necessário.
 *
 * @Service marca esta classe como um componente de serviço do Spring,
 *          tornando-a elegível para injeção de dependência.
 */
@Service
public class CategoriaService {
	/**
	 * Repositório para operações de persistência com categorias.
	 *
	 * @Autowired instrui o Spring a injetar automaticamente uma instância do
	 *            repositório quando esta classe for criada.
	 */
	@Autowired
	private CategoriaRepository categoriaRepository;

	/**
	 * Lista todas as categorias cadastradas no sistema.
	 *
	 * @return Lista contendo todas as categorias
	 */
	public List<Categoria> listarTodas() {
		return categoriaRepository.findAll();
	}

	/**
	 * Busca uma categoria específica por seu ID.
	 *
	 * @param id Identificador único da categoria
	 * @return Optional contendo a categoria se encontrada, vazio caso contrário
	 */
	public Optional<Categoria> buscarPorId(Long id) {
		return categoriaRepository.findById(id);
	}

	/**
	 * Salva uma categoria no banco de dados.
	 *
	 * Este método pode ser usado tanto para criar novas categorias quanto para
	 * atualizar categorias existentes.
	 *
	 * @param categoria Categoria a ser salva
	 * @return Categoria salva com ID atualizado
	 */
	public Categoria salvar(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}

	/**
	 * Remove uma categoria do sistema.
	 *
	 * ATENÇÃO: Esta operação pode falhar se existirem itens associados à categoria
	 * devido a restrições de integridade referencial.
	 *
	 * @param id ID da categoria a ser removida
	 */
	public void deletar(Long id) {
		categoriaRepository.deleteById(id);
	}
}