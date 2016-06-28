package br.com.lfcsystems.syscrum.infra;

import java.util.List;

import javax.ejb.Local;

@Local
public interface CrudRepository<T, ID> extends Repository {
	
	List<T> findAll();
	
	T findById(ID id);
	
	void saveOrUpdate(T obj);
	
	void delete(T obj);
	
}