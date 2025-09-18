package biblioteca.servico;

import java.sql.SQLException;
import java.util.List;

import biblioteca.modelo.Categoria;
import biblioteca.repositorio.CategoriaDAO;

public class CategoriaService {
	
	private CategoriaDAO categoriaDAO;
	
	public CategoriaService() {
		this.categoriaDAO = new CategoriaDAOImpl();
	}
	
	public void adicionarCategoria(Categoria categoria) throws SQLException{
		if (categoria.getNome() == null || categoria.getNome().trim().isEmpty()) {
			throw new IllegalArgumentException("O nome da categoria não pode ser vazio.");
		}
		// Verifica se a categoria já existe antes de adicionar
		if(categoriaDAO.buscarCategoriaPorNome(categoria.getNome()) != null) {
			throw new IllegalArgumentException("Categoria com este nome já existe.");
		}
		
		categoriaDAO.adicionarCategoria(categoria);
	}
	
	public Categoria buscarCategoriaPorId(int id) throws SQLException{
		return categoriaDAO.buscarCategoriaPorId(id);
	}
	
	public Categoria buscarCategoriaPorNome(String nome) throws SQLException{
		return categoriaDAO.buscarCategoriaPorNome(nome);
	}
	
	public List<Categoria> listarTodasCategorias() throws SQLException{
		return categoriaDAO.listarTodasCategorias();
	}
	
	public void removerCategoria(int id) throws SQLException{
		categoriaDAO.removerCategoria(id);
	}
	

}
