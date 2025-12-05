package br.com.fuctura.bibliotecanoite.controllers;

import br.com.fuctura.bibliotecanoite.controllers.dtos.CategoriaDto;
import br.com.fuctura.bibliotecanoite.models.Categoria;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CategoriaController {

    ResponseEntity<CategoriaDto>findById(Integer id);
    ResponseEntity <List<CategoriaDto>>findAll();

    ResponseEntity <CategoriaDto> save(CategoriaDto categoriaDto);

    ResponseEntity <CategoriaDto> update (Integer id, CategoriaDto categoriaDto);
    void delete (Integer id);
}
