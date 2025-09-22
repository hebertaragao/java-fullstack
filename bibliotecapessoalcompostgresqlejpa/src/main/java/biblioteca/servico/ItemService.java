package biblioteca.servico;

import java.sql.SQLException;
import java.util.List;

import biblioteca.modelo.Categoria;
import biblioteca.modelo.Item;
import biblioteca.repositorio.CategoriaDAO;
import biblioteca.repositorio.CategoriaDAOImpl;
import biblioteca.repositorio.ItemDAO;
import biblioteca.repositorio.ItemDAOImpl;

public class ItemService {
	
	private ItemDAO itemDAO;
	private CategoriaDAO categoriaDAO;
	
	public ItemService(){
		this.itemDAO = new ItemDAOImpl();
		this.categoriaDAO = new CategoriaDAOImpl();
	}
	
	public void adicionarItem(Item item) throws SQLException{
		if(item.getTitulo() == null || item.getTitulo().trim().isEmpty()) {
			throw new IllegalArgumentException("O título do item não pode ser vazio.");
		}
		if(item.getAutorArtista() == null || item.getAutorArtista().trim().isEmpty()) {
			throw new IllegalArgumentException("O autor/artista do item não pode ser vazio.");
		}
		if(item.getCategoria() == null || item.getCategoria().getNome().trim().isEmpty()) {
			throw new IllegalArgumentException("A categoria do item não pode ser vazia.");
		}
		
		// Verifica se a categoria já existe, se não, adiciona
		
		Categoria categoriaExistente = categoriaDAO.buscarCategoriaPorNome(item.getCategoria().getNome());
			if (categoriaExistente == null) {
				categoriaDAO.adicionarCategoria(item.getCategoria());
			}else {
				item.setCategoria(categoriaExistente); //Garante que o item use a categoria existente com ID
			}
			
			itemDAO.adicionarItem(item);
	}
	
	public Item buscarItemPorId(int id) throws SQLException{
		return itemDAO.buscarItemPorId(id);
	}
	
	public List<Item> listarTodosItens() throws SQLException{
		return itemDAO.listarTodosItens();
	}
	
	public List<Item> listarItensPorCategoria(String nomeCategoria) throws SQLException{
		Categoria categoria = categoriaDAO.buscarCategoriaPorNome(nomeCategoria);
		if(categoria != null) {
			return itemDAO.listarItensPorCAtegoria(categoria.getId());
		}else {
			return new java.util.ArrayList<>(); // Retorna lista vazia se a categoria não existir
		}
		
	}
	
	public void removerItem(int id) throws SQLException {
		itemDAO.removerItem(id);
	}

}
