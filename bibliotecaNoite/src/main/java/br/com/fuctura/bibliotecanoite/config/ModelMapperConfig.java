package br.com.fuctura.bibliotecanoite.config;

import jakarta.annotation.PostConstruct;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @PostConstruct
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
