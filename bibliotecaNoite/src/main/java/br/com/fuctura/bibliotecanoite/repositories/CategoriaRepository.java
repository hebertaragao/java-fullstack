package br.com.fuctura.bibliotecanoite.repositories;

import br.com.fuctura.bibliotecanoite.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
