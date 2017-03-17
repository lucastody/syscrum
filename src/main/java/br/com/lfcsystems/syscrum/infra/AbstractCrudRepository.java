package br.com.lfcsystems.syscrum.infra;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public abstract class AbstractCrudRepository<T, ID> extends AbstractRepository implements CrudRepository<T, ID> {
	
	private Class<T> persistentClass;
	
	@SuppressWarnings("unchecked")
	public AbstractCrudRepository() {
		this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	protected CriteriaBuilder getBuilder() {
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		return builder;
	}
	
	public List<T> findAll() {
	    CriteriaQuery<T> query = getBuilder().createQuery(persistentClass);
	    Root<T> root = query.from(persistentClass);
	    query.select(root);
		
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