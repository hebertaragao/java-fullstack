package br.com.fuctura.bibliotecanoite.controllers.impl;

import br.com.fuctura.bibliotecanoite.controllers.CategoriaController;
import br.com.fuctura.bibliotecanoite.models.Categoria;
import br.com.fuctura.bibliotecanoite.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("categoria")
public class CategoriaControllerImpl implements CategoriaController {

    //@GetMapping("/{id}")
    //findById = Método para buscar uma categoria pelo ID

    //@GetMapping
    //findAll = Método para listar todas as categorias

    //@PostMapping
    //save = Método para criar uma nova categoria

    //@PutMapping("/{id}")
    //update = Método para atualizar uma categoria existente

    //@DeleteMapping("/{id}")
    //delete = Método para deletar uma categoria pelo ID

    @Autowired
    private CategoriaService categoriaService;


    @Override
    @GetMapping(value = "{id}")
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
    public Categoria save(@RequestBody Categoria categoria) {
        Categoria cat = categoriaService.save(categoria);
        return cat;
    }

    @Override
    @PutMapping("/{id}")
    public Categoria update(@PathVariable Integer id,@RequestBody Categoria categoria) {
        Categoria cat = categoriaService.update(id, categoria);
        return cat;
    }

    @Override
    public void delete(Integer id) {

    }
}
