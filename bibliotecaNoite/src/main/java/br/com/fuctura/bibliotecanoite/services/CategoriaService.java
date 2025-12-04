package br.com.fuctura.bibliotecanoite.services;

import br.com.fuctura.bibliotecanoite.models.Categoria;
import br.com.fuctura.bibliotecanoite.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria findById(Integer id) {
       Optional <Categoria> categoria = categoriaRepository.findById(id);
       return categoria.get();
    }

    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }
    public Categoria save(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public Categoria update(Integer id, Categoria categoria) {
        categoria.setId(id);
        return categoriaRepository.save(categoria);
    }

    public void delete(Integer id) {
    }
}
