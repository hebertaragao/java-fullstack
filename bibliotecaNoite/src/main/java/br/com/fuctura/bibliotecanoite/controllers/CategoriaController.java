package br.com.fuctura.bibliotecanoite.controllers;

import br.com.fuctura.bibliotecanoite.controllers.dtos.CategoriaDto;
import br.com.fuctura.bibliotecanoite.models.Categoria;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CategoriaController {

    ResponseEntity<CategoriaDto>findById(Integer id);
    ResponseEntity <List<CategoriaDto>>findAll();

    Categoria save(Categoria categoria);

    Categoria update (Integer id, Categoria categoria);
    void delete (Integer id);



}
