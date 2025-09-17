package biblioteca.repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
	
	private static final String URL = "jdbc:postgresql://localhost:5432/biblioteca_db";
	private static final String USUARIO = "biblioteca_user";
	private static final String SENHA = "biblioteca_password";
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(URL, USUARIO, SENHA);
	}

}
