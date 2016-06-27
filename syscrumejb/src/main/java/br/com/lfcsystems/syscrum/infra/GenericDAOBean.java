package br.com.lfcsystems.syscrum.infra;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

@SuppressWarnings("unchecked")
public abstract class GenericDAOBean<T, ID> implements GenericDAO<T, ID> {

	@PersistenceContext(unitName = "syscrumPU")
	private EntityManager entityManager;
	
	private Class<T> persistentClass;
	
	public GenericDAOBean() {
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