package biblioteca.repositorio;

import java.sql.SQLException;
import java.util.List;

import biblioteca.modelo.Categoria;

public interface CategoriaDAO {
	
	void adicionarCategoria(Categoria categoria) throws SQLException;
	Categoria buscarCategoriaPorId(int id) throws SQLException;
	Categoria buscarCategoriaPorNome(String nome) throws SQLException;
	List<Categoria> listarTodasCategorias() throws SQLException;
	void removerCategoria(int id) throws SQLException;
}
