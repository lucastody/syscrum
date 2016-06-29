package br.com.lfcsystems.syscrum.infra;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public abstract class AbstractRepository implements Repository {

	@PersistenceContext(unitName = "syscrumPU")
	protected EntityManager entityManager;
	
}