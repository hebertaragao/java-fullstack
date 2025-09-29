package biblioteca.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import java.util.Arrays;

/**
 * Configuração CORS (Cross-Origin Resource Sharing) para permitir requisições
 * do frontend Angular para o backend Spring Boot.
 *
 * CORS é necessário quando frontend e backend executam em domínios, portas ou
 * protocolos diferentes, o que é comum durante desenvolvimento.
 *
 * @Configuration indica que esta classe contém definições de beans que devem
 *                ser processadas pelo container Spring.
 */
@Configuration
public class CorsConfig {
	/**
	 * Configura as regras CORS para toda a aplicação.
	 *
	 * @return CorsConfigurationSource configurado com as regras apropriadas
	 */
	@Bean
	public CorsConfigurationSource corsConfigurationSource() {
		CorsConfiguration configuration = new CorsConfiguration();
// Permite requisições de qualquer origem durante desenvolvimento
// Em produção, deve ser restrito aos domínios específicos
		configuration.setAllowedOriginPatterns(Arrays.asList("*"));
// Métodos HTTP permitidos
		configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
// Headers permitidos nas requisições
		configuration.setAllowedHeaders(Arrays.asList("*"));
// Permite envio de credenciais (cookies, headers de autenticação)
		configuration.setAllowCredentials(true);
// Aplica a configuração a todas as rotas
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", configuration);
		return source;
	}
}