package br.com.lfcsystems.syscrum.infra;

import java.util.List;

public interface GenericDAO<T, ID> {
	
	public List<T> findAll();
	
	public T findById(ID id);
	
	public void saveOrUpdate(T obj);
	
	public void delete(T obj);
	
}