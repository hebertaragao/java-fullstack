package biblioteca.aplicacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "biblioteca")
public class AplicacaoPrincipal {
	
	public static void main(String[] args) {
		SpringApplication.run(AplicacaoPrinipal.class, args);
	}

}
