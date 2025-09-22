package biblioteca.repositorio;

import biblioteca.modelo.Categoria;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAOImpl implements CategoriaDAO {

	@Override
	public void adicionarCategoria(Categoria categoria) throws SQLException {
		String sql = "INSERT INTO categorias (nome) VALUES (?)";
		try (Connection conn = ConexaoBD.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
			stmt.setString(1, categoria.getNome());
			stmt.executeUpdate();
			try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
				if (generatedKeys.next()) {
					categoria.setId(generatedKeys.getInt(1));
				}
			}
		}
	}

	@Override
	public Categoria buscarCategoriaPorId(int id) throws SQLException {
		String sql = "SELECT * FROM categorias WHERE id = ?";
		try (Connection conn = ConexaoBD.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, id);
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					return new Categoria(rs.getInt("id"), rs.getString("nome"));
				}
			}
		}
		return null;
	}

	@Override
	public Categoria buscarCategoriaPorNome(String nome) throws SQLException {
		String sql = "SELECT * FROM categorias WHERE nome = ?";
		try (Connection conn = ConexaoBD.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, nome);
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					return new Categoria(rs.getInt("id"), rs.getString("nome"));
				}
			}
		}
		return null;
	}

	@Override
	public List<Categoria> listarTodasCategorias() throws SQLException {
		List<Categoria> categorias = new ArrayList<>();
		String sql = "SELECT * FROM categorias";
		try (Connection conn = ConexaoBD.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery()) {
			while (rs.next()) {
				categorias.add(new Categoria(rs.getInt("id"), rs.getString("nome")));
			}
		}
		return categorias;
	}

	@Override
	public void removerCategoria(int id) throws SQLException {
		String sql = "DELETE FROM categorias WHERE id = ?";
		try (Connection conn = ConexaoBD.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, id);
			stmt.executeUpdate();
		}
	}
}