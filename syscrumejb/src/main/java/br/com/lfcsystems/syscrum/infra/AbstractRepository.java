package br.com.lfcsystems.syscrum.infra;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

@Stateless
public abstract class AbstractRepository<T, ID> implements CrudRepository<T, ID> {

	@PersistenceContext(unitName = "syscrumPU")
	private EntityManager entityManager;
	
	private Class<T> persistentClass;
	
	@SuppressWarnings("unchecked")
	public AbstractRepository() {
		this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	public List<T> findAll() {
		CriteriaQuery<T> query = entityManager.getCriteriaBuilder().createQuery(persistentClass);
		return entityManager.createQuery(query).getResultList();
	}

	public T findById(ID id) {
		return entityManager.find(persistentClass, id);
	}
	
	public void saveOrUpdate(T obj) {
		entityManager.persist(obj);
	}

	public void delete(T obj) {
		entityManager.remove(obj);
	}
}