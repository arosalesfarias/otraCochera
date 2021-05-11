package com.otraCochera.demo.repo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.otraCochera.demo.domain.Saludo;

@Repository
public class RepoSaludo {
	@PersistenceContext
	EntityManager entityManager;

	@Transactional(readOnly = false)
	public void crear(Saludo saludo) {
		EntityManager entityManagerCrear = this.entityManager;
		try {
			entityManagerCrear.persist(saludo);
		} catch (PersistenceException e) {
			e.printStackTrace();
			// entityManager.transaction.rollback
			throw new RuntimeException("Ocurrió un error, la operación no puede completarse", e);
		} finally {
			if (entityManager == null) {
				System.out.println("Entre consulta crear");
				entityManager.close();
			}
		}
	}

}
