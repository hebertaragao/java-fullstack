package biblioteca.repositorio;

import biblioteca.modelo.*;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ItemDAOImpl implements ItemDAO {
	private CategoriaDAO categoriaDAO;

	public ItemDAOImpl() {
		this.categoriaDAO = new CategoriaDAOImpl();
	}

	@Override
	public void adicionarItem(Item item) throws SQLException {
		String sql = "INSERT INTO itens (titulo, autor_artista, categoria_id, tipo_item, isbn, numero_paginas, editora, data_publicacao, genero, numero_faixas) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try (Connection conn = ConexaoBD.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
			stmt.setString(1, item.getTitulo());
			stmt.setString(2, item.getAutorArtista());
			stmt.setInt(3, item.getCategoria().getId());
			stmt.setString(4, item.getClass().getSimpleName()); // Tipo do item (Livro, Revista, AlbumMusica)
			if (item instanceof Livro) {
				Livro livro = (Livro) item;
				stmt.setString(5, livro.getIsbn());
				stmt.setInt(6, livro.getNumeroPaginas());
				stmt.setNull(7, Types.VARCHAR);
				stmt.setNull(8, Types.DATE);
				stmt.setNull(9, Types.VARCHAR);
				stmt.setNull(10, Types.INTEGER);
			} else if (item instanceof Revista) {
				Revista revista = (Revista) item;
				stmt.setNull(5, Types.VARCHAR);
				stmt.setNull(6, Types.INTEGER);
				stmt.setString(7, revista.getEditora());
				stmt.setDate(8, Date.valueOf(revista.getDataPublicacao()));
				stmt.setNull(9, Types.VARCHAR);
				stmt.setNull(10, Types.INTEGER);
			} else if (item instanceof AlbumMusica) {
				AlbumMusica album = (AlbumMusica) item;
				stmt.setNull(5, Types.VARCHAR);
				stmt.setNull(6, Types.INTEGER);
				stmt.setNull(7, Types.VARCHAR);
				stmt.setNull(8, Types.DATE);
				stmt.setString(9, album.getGenero());
				stmt.setInt(10, album.getNumeroFaixas());
			} else {
				// Para o tipo Item genérico ou outros tipos não especificados
				stmt.setNull(5, Types.VARCHAR);
				stmt.setNull(6, Types.INTEGER);
				stmt.setNull(7, Types.VARCHAR);
				stmt.setNull(8, Types.DATE);
				stmt.setNull(9, Types.VARCHAR);
				stmt.setNull(10, Types.INTEGER);
			}
			stmt.executeUpdate();
			try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
				if (generatedKeys.next()) {
					item.setId(generatedKeys.getInt(1));
				}
			}
		}
	}

	@Override
	public Item buscarItemPorId(int id) throws SQLException {
		String sql = "SELECT * FROM itens WHERE id = ?";
		try (Connection conn = ConexaoBD.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, id);
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					return criarItemDoResultSet(rs);
				}
			}
		}
		return null;
	}

	@Override
	public List<Item> listarTodosItens() throws SQLException {
		List<Item> itens = new ArrayList<>();
		String sql = "SELECT * FROM itens";
		try (Connection conn = ConexaoBD.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery()) {
			while (rs.next()) {
				itens.add(criarItemDoResultSet(rs));
			}
		}
		return itens;
	}

	@Override
	public List<Item> listarItensPorCategoria(int categoriaId) throws SQLException {
		List<Item> itens = new ArrayList<>();
		String sql = "SELECT * FROM itens WHERE categoria_id = ?";
		try (Connection conn = ConexaoBD.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, categoriaId);
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					itens.add(criarItemDoResultSet(rs));
				}
			}
		}
		return itens;
	}

	@Override
	public void removerItem(int id) throws SQLException {
		String sql = "DELETE FROM itens WHERE id = ?";
		try (Connection conn = ConexaoBD.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, id);
			stmt.executeUpdate();
		}
	}

	private Item criarItemDoResultSet(ResultSet rs) throws SQLException {
		int id = rs.getInt("id");
		String titulo = rs.getString("titulo");
		String autorArtista = rs.getString("autor_artista");
		int categoriaId = rs.getInt("categoria_id");
		LocalDate dataCadastro = rs.getDate("data_cadastro").toLocalDate();
		String tipoItem = rs.getString("tipo_item");

		Categoria categoria = categoriaDAO.buscarCategoriaPorId(categoriaId);

		Item item = null;
		switch (tipoItem) {
		case "Livro":
			String isbn = rs.getString("isbn");
			int numeroPaginas = rs.getInt("numero_paginas");
			item = new Livro(titulo, autorArtista, categoria, isbn, numeroPaginas);
			break;
		case "Revista":
			String editora = rs.getString("editora");
			LocalDate dataPublicacao = rs.getDate("data_publicacao").toLocalDate();
			item = new Revista(titulo, autorArtista, categoria, editora, dataPublicacao);
			break;
		case "AlbumMusica":
			String genero = rs.getString("genero");
			int numeroFaixas = rs.getInt("numero_faixas");
			item = new AlbumMusica(titulo, autorArtista, categoria, genero, numeroFaixas);
			break;
		default:
			// Tratar caso de tipo desconhecido ou Item genérico
			item = new Item(titulo, autorArtista, categoria) {
			}; // Anonymous class for generic Item
			break;
		}
		item.setId(id);
		item.setDataCadastro(dataCadastro);
		return item;
	}
}
