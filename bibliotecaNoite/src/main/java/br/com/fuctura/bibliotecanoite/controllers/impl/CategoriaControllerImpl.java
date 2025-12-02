package br.com.fuctura.bibliotecanoite.controllers.impl;

import br.com.fuctura.bibliotecanoite.controllers.CategoriaController;
import br.com.fuctura.bibliotecanoite.models.Categoria;

import java.util.List;

public class CategoriaControllerImpl implements CategoriaController {


    @Override
    public Categoria findById(Integer id) {
        return null;
    }

    @Override
    public List<Categoria> findAll() {
        return List.of();
    }

    @Override
    public Categoria update(Integer id, Categoria categoria) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
