package biblioteca.aplicacao;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import biblioteca.modelo.AlbumMusica;
import biblioteca.modelo.Categoria;
import biblioteca.modelo.Item;
import biblioteca.modelo.Livro;
import biblioteca.modelo.Revista;
import biblioteca.servico.CategoriaService;
import biblioteca.servico.ItemService;

public class Main {

	private static ItemService itemService = new ItemService();
	private static CategoriaService categoriaService = new CategoriaService();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int opcao;
		do {
			exibirMenu();
			opcao = scanner.nextInt();
			scanner.nextLine(); // Consumir quebra de linha

			switch (opcao) {
			case 1:
				adicionarItem();
				break;
			case 2:
				listarItens();
				break;
			case 3:
				listarItensPorCategoria();
				break;
			case 4:
				removerItem();
				break;
			case 5:
				adicionarCategoria();
				break;
			case 6:
				listarCategorias();
				break;
			case 0:
				System.out.println("Saindo do progrma. Até mais");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
			System.out.println(); // Linha em branco para melhor visualização
		} while (opcao != 0);

		scanner.close();
	}

	private static void exibirMenu() {
		System.out.println("==== Organizador de Biblioteca Pessoal ====");
		System.out.println("1. Adicionar Item");
		System.out.println("2. Listar Todos os Itens");
		System.out.println("3. Listar Itens por Categoria");
		System.out.println("4. Remover Item");
		System.out.println("5. Adicionar Categoria");
		System.out.println("6. Listar Categorias");
		System.out.println("0. Sair");
		System.out.print("Escolha uma opção: ");
	}

	private static void adicionarItem() {
		System.out.println("\n==== Adicionar Novo Item ====");
		System.out.print("Título: ");
		String titulo = scanner.nextLine();
		System.out.print("Autor/Artista: ");
		String autorArtista = scanner.nextLine();

		Categoria categoriaSelecionada = selecionarOuCriarCategoria();
		if (categoriaSelecionada == null) {
			System.out.println("Operação cancelada ou categoria inválida.");
			return;
		}

		System.out.println("Tipo de Item (1-Livro, 2-Revista, 3-Álbum de Música):");
		int tipo = scanner.nextInt();
		scanner.nextLine(); // Consumir a quebra de linha

		Item novoItem = null;
		try {
			switch (tipo) {
			case 1:
				System.out.println("ISBN: ");
				String isbn = scanner.nextLine();
				System.out.println("Número de Páginas: ");
				int numPaginas = scanner.nextInt();
				scanner.nextLine();
				novoItem = new Livro(titulo, autorArtista, categoriaSelecionada, isbn, numPaginas);
				break;
			case 2:
				System.out.println("Editora: ");
				String editora = scanner.nextLine();
				System.out.println("Data de Publicação (AAAA-MD-DD):");
				LocalDate dataPublicacao = LocalDate.parse(scanner.nextLine());
				novoItem = new Revista(titulo, autorArtista, categoriaSelecionada, editora, dataPublicacao);
				break;
			case 3:
				System.out.println("Gênero: ");
				String genero = scanner.nextLine();
				System.out.println("Número de Faixas:");
				int numFaixas = scanner.nextInt();
				scanner.nextLine();
				novoItem = new AlbumMusica(titulo, autorArtista, categoriaSelecionada, genero, numFaixas);
				break;
			default:
				System.out.println("Tipo de item inválido.");
				return;
			}

			itemService.adicionarItem(novoItem);
			System.out.println("Item adicionado com sucesso! ID: " + novoItem.getId());
		} catch (IllegalArgumentException e) {
			System.out.println("Erro de validação: " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Erro ao adicionar item no banco de dados: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
		}
	}

	private static Categoria selecionarOuCriarCategoria() {
		System.out.println("\n=== Selecionar ou Criar Categoria ===");
		try {
			List<Categoria> categoriasExistentes = categoriaService.listarTodasCategorias();
			if (categoriasExistentes.isEmpty()) {
				System.out.println("Nenhuma categoria cadastrada. Por favor, adicione uma nova categoria.");
				String nomeNovaCategoria = scanner.nextLine();
				Categoria novaCategoria = new Categoria(nomeNovaCategoria);
				CategoriaService.adicionarCategoria(novaCategoria);
				System.out.println("Nova categoria \"" + nomeNovaCategoria + "\" adicionada com sucesso ");
				return novaCategoria;
			} else {
				System.out.println("Categorias existentes: ");
				for (Categoria cat : categoriasExistentes) {
					System.out.println(cat.getId() + "." + cat.getNome());
				}
				System.out.println("Digite o ID da categoria existente ou 0 para adicionar uma nova: ");
				int idCategoria = scanner.nextInt();
				scanner.nextLine();

				if (idCategoria == 0) {
					System.out.println("Nome da nova categoria:");
					String nomeNovaCategoria = scanner.nextLine();
					Categoria novaCategoria = new Categoria(nomeNovaCategoria);
					categoriaService.adicionarCategoria(novaCategoria);
					;
					System.out.println("Nova categoria \" " + nomeNovaCategoria + "\" adicionada com sucesso!");
					return novaCategoria;
				} else {
					Categoria categoria = categoriaService.buscarCategoriaPorId(idCategoria);
					if (categoria != null) {
						return categoria;
					} else {
						System.out.println("ID de categoria inválido.");
						return null;
					}
				}
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Erro de validação da categoria: " + e.getMessage());
			return null;
		} catch (SQLException e) {
			System.out.println("Erro ao acessar categorias no banco de dados: " + e.getMessage());
			return null;
		}

	}

	private static void adicionarCategoria() {
		System.out.println("\n=== Adicionar nova Categoria ===");
		System.out.println("Nome da Categoria: ");
		String nome = scanner.nextLine();
		try {
			Categoria novaCategoria = new Categoria(nome);
			categoriaService.adicionarCategoria(novaCategoria);
			;
			System.out.println("Categoria adicionada com sucesso! ID: " + novaCategoria.getId());
		} catch (IllegalArgumentException e) {
			System.out.println("Erro de validação: " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Erro ao adicionar categoria no banco de dados:" + e.getMessage());
		}
	}

	private static void listarCategorias() {
		System.out.println("\n=== Categorias Cadastradas ===");
		try {
			List<Categoria> categorias = categoriaService.listarTodasCategorias();
			if (categorias.isEmpty()) {
				System.out.println("Nenhuma categoria cadastrada.");
			} else {
				for (Categoria cat : categorias) {
					System.out.println(cat);
				}
			}
			}catch (SQLException e) {
				System.out.println("Erro ao listar categorias: " + e.getMessage());
			}
	}
	
	public static void listarItens() {
		System.out.println("\n=== Todos os Itens Cadastrados ===");
		try {
			List<Item> itens = itemService.listarTodosItens();
			if(itens.isEmpty()) {
				System.out.println("Nenhum item cadastrado.");
			}else {
				for(Item item : itens) {
					System.out.println("-------------------------------");
					System.out.println("-------------------------------");
				}
				System.out.println("-------------------------------");
			}
		}catch (SQLException e) {
			System.out.println("Erro ao listar itens: " + e.getMessage());
		}
	}
	
	private static void listarItensPorCategoria() {
		System.out.println("\n=== listar Itens por Categoria ===");
		System.out.println("Digite o nome da categoria: ");
		String nomeCategoria = scanner.nextLine();
		try {
			List<Item> itens = itemService.listarItensPorCategoria(nomeCategoria);
			if (itens.isEmpty()) {
				System.out.println("Nenhum item encontrado para a categoria: \"" + nomeCategoria + "\"");
			} else {
				System.out.println("itens na categoria \"" + nomeCategoria + "\"");
					for (Item item : itens) {
						System.out.println("-------------------------------");
						System.out.println(item);
					}
					System.out.println("-------------------------------");
			}
		}catch (SQLException e) {
			System.out.println("Erro ao listar itens por categoria: " + e.getMessage());
		}
	}
	
	private static void removerItem() {
		System.out.println("\n=== Remover Item ===");
		System.out.println("Digite o ID do item a ser removido: ");
		int id = scanner.nextInt();
		scanner.nextLine(); // consumir a quebra de linha
		
		try {
			Item item = itemService.buscarItemPorId(id);
			if (item != null) {
				System.out.println("Tem certeza que deseja remover o item: \"" + item.getTitulo() + "\" (S/N)?");
				String confirmacao = scanner.nextLine();
				if(confirmacao.equalsIgnoreCase("S")) {
					itemService.removerItem(id);
					System.out.println("Item removido com sucesso!");
				}else {
					System.out.println("Remoção cancelada.");
				}
				}else {
					System.out.println("Item com ID " + id + " não encontrado.");
				}
		}catch (SQLException e) {
			System.out.println("Erro ao remover item: " + e.getMessage());
		}
	}
}
