package br.com.bancodedadosfuctura;

import java.util.Calendar;

import br.com.bancodedadosfuctura.entity.Pessoa;
import br.com.bancodedadosfuctura.util.JpaUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;


/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
//		System.out.println(System.getProperty("java.version"));
//		21.0.6
		

		EntityManager ent = JpaUtil.getEntityManager();
		EntityTransaction tx = ent.getTransaction();

		Pessoa pessoa = new Pessoa();

		pessoa.setNome("Hebert");
		pessoa.setPeso(82.0);
		pessoa.setCutis("Branco");
		Calendar cal = Calendar.getInstance();
		cal.set(1975, Calendar.JULY, 02, 5, 30, 0);
		pessoa.setNascimento(cal.getTime());

		try {
			tx.begin();
			ent.persist(pessoa);

			tx.commit();
			ent.close();

		} catch (Exception e) {
			tx.rollback();

		}

	}
}