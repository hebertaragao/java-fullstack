package biblioteca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe principal da aplicação Spring Boot.
 *
 * A anotação @SpringBootApplication combina três anotações importantes:
 * - @Configuration: Indica que a classe pode ser usada como fonte de definições
 * de beans - @EnableAutoConfiguration: Habilita a configuração automática do
 * Spring Boot - @ComponentScan: Habilita o escaneamento de componentes no
 * pacote atual e subpacotes
 *
 * Esta classe serve como ponto de entrada da aplicação e configura
 * automaticamente todos os componentes necessários baseado nas dependências
 * presentes no classpath.
 */
@SpringBootApplication
public class BackendApplication {
	/**
	 * Método principal que inicia a aplicação Spring Boot.
	 *
	 * @param args Argumentos da linha de comando passados para a aplicação
	 */
	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
}
