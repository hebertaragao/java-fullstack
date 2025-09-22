package biblioteca.repositorio;

import java.sql.SQLException;
import java.util.List;

import biblioteca.modelo.Item;

public interface ItemDAO {
	
	void adicionarItem(Item item) throws SQLException;
	Item buscarItemPorId(int id) throws SQLException;
	List<Item> listarTodosItens() throws SQLException;
	void removerItem(int id) throws SQLException;
	List<Item> listarItensPorCategoria(int categoriaID) throws SQLException;
}
