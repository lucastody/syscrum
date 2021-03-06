package br.com.lfcsystems.syscrum.infra;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractRepository implements Repository {

	@PersistenceContext(unitName = "syscrumPU")
	protected EntityManager entityManager;
	
}