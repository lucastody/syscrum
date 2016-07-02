package br.com.lfcsystems.syscrum.dao;

import java.util.List;

import javax.ejb.Local;

import br.com.lfcsystems.syscrum.domain.Sistema;
import br.com.lfcsystems.syscrum.infra.CrudRepository;

@Local
public interface SistemaDAO extends CrudRepository<Sistema, Long> {
	
	List<Sistema> listarAtivos();
	
}