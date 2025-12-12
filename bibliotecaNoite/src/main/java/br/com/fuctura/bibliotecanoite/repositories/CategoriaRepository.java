package br.com.fuctura.bibliotecanoite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fuctura.bibliotecanoite.models.Categoria;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

    Optional<Categoria> findByNomeIgnoreCaseContaining(String nome);
}
