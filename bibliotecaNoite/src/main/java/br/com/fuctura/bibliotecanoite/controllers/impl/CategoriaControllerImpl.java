package br.com.fuctura.bibliotecanoite.controllers.impl;

import br.com.fuctura.bibliotecanoite.controllers.CategoriaController;
import br.com.fuctura.bibliotecanoite.models.Categoria;
import br.com.fuctura.bibliotecanoite.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaControllerImpl implements CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @Override
    @GetMapping("/{id}")
    public Categoria findById(@PathVariable Integer id) {
        Categoria categoria = categoriaService.findById(id);
        return categoria;
    }

    @Override
    @GetMapping
    public List<Categoria> findAll() {
        return List.of();
    }

    @Override
    public Categoria save(Categoria categoria) {
        return null;
    }
    @Override
    public Categoria update(Integer id, Categoria categoria) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
