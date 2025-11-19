package biblioteca.repository;

import biblioteca.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface de repositório para operações com a entidade Categoria.
 *
 * Estende JpaRepository que fornece implementação automática de métodos CRUD
 * básicos como save(), findById(), findAll(), delete(), etc.
 *
 * O Spring Data JPA gera automaticamente a implementação desta interface em
 * tempo de execução, eliminando a necessidade de código boilerplate.
 *
 * Os parâmetros genéricos são: - Categoria: tipo da entidade gerenciada - Long:
 * tipo da chave primária
 */
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
// Métodos CRUD básicos são herdados automaticamente de JpaRepository
// Métodos customizados podem ser adicionados aqui se necessário
}
