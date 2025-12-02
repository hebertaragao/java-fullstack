package br.com.fuctura.bibliotecanoite.services;

import br.com.fuctura.bibliotecanoite.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    
}
