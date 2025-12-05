package br.com.fuctura.bibliotecanoite.controllers.impl;

import br.com.fuctura.bibliotecanoite.controllers.CategoriaController;
import br.com.fuctura.bibliotecanoite.controllers.dtos.CategoriaDto;
import br.com.fuctura.bibliotecanoite.models.Categoria;
import br.com.fuctura.bibliotecanoite.services.CategoriaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

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


    @Autowired
    private ModelMapper modelMapper;

    @Override
    @GetMapping(value = "{id}")
    public ResponseEntity<CategoriaDto> findById(@PathVariable Integer id) {
        Categoria categoria = categoriaService.findById(id);
        return ResponseEntity.ok().body(modelMapper.map(categoria, CategoriaDto.class));
    }

    @Override
    @GetMapping
    public ResponseEntity <List<CategoriaDto>> findAll() {
        List<Categoria> list = categoriaService.findAll();
        return ResponseEntity.ok().body(list.stream().map(obj ->
                modelMapper.map(obj, CategoriaDto.class)).collect(Collectors.toList()));
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
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
       categoriaService.delete(id);
    }
}
