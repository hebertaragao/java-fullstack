package br.com.fuctura.bibliotecanoite.profiles;

import br.com.fuctura.bibliotecanoite.services.DBService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("test")
@Configuration
public class TestProfile {

    @Autowired
    private DBService dbService;

    @PostConstruct
    public void instanciaDB() {
        this.dbService.instanciaDB();
    }
}