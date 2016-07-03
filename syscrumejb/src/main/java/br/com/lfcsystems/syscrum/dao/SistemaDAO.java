package br.com.lfcsystems.syscrum.dao;

import java.util.List;

import br.com.lfcsystems.syscrum.domain.Sistema;
import br.com.lfcsystems.syscrum.infra.CrudRepository;

public interface SistemaDAO extends CrudRepository<Sistema, Long> {
	
	List<Sistema> listarAtivos();
	
}