package br.com.fuctura.bibliotecanoite.controllers.impl;

import br.com.fuctura.bibliotecanoite.controllers.CategoriaController;
import br.com.fuctura.bibliotecanoite.models.Categoria;
import br.com.fuctura.bibliotecanoite.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        List<Categoria> list = categoriaService.findAll();
        return list;
    }

    @Override
    @PostMapping
    public Categoria save(Categoria categoria) {
        Categoria cat = categoriaService.save(categoria);
        return cat;
    }
    @Override
    public Categoria update(Integer id, Categoria categoria) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
