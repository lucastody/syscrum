package br.com.lfcsystems.syscrum.dao.bean;

import java.util.List;

import javax.persistence.Query;

import br.com.lfcsystems.syscrum.dao.SistemaDAO;
import br.com.lfcsystems.syscrum.domain.Sistema;
import br.com.lfcsystems.syscrum.infra.AbstractCrudRepository;

@SuppressWarnings("unchecked")
public class SistemaDAOBean extends AbstractCrudRepository<Sistema, Long> implements SistemaDAO {
	
	@Override
	public List<Sistema> listarAtivos() {
		Query query = entityManager.createQuery("SELECT sistema FROM Sistema WHERE ativo = true");
		return query.getResultList();
	}
	
}