package br.com.fuctura.bibliotecanoite.controllers;

import br.com.fuctura.bibliotecanoite.models.Categoria;

import java.util.List;

public interface CategoriaController {

    Categoria findById(Integer id);
    List<Categoria> findAll();
    Categoria update (Integer id, Categoria categoria);
    void delete (Integer id);

}
