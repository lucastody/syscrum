package br.com.lfcsystems.syscrum.negocio.pesquisarSistemas;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.Query;

import br.com.lfcsystems.syscrum.dao.SistemaDAO;
import br.com.lfcsystems.syscrum.domain.Sistema;
import br.com.lfcsystems.syscrum.infra.AbstractRepository;

public class PesquisarSistemasRepository extends AbstractRepository {
	
	@SuppressWarnings("unused")
	@Inject
	private SistemaDAO sistemaDAO;
	
	@SuppressWarnings("unchecked")
	public List<Sistema> pesquisar(Integer pagina, Integer quantidade, String nome, Boolean situacao) {
		StringBuilder jpql = new StringBuilder();
		jpql.append("SELECT sistema ");
		jpql.append("FROM Sistema sistema ");
		jpql.append("WHERE 1 = 1 ");
		
		if(nome != null && !"".equals(nome)) {
			jpql.append("AND sistema.nome LIKE :nome ");
		}
		
		if(situacao != null) {
			jpql.append("AND sistema.ativo = :situacao ");
		}
		
		jpql.append("ORDER BY sistema.nome ");
		
		Query query = entityManager.createQuery(jpql.toString());
		
		if(pagina != null && quantidade != null) {
			query.setFirstResult((pagina == 0) ? pagina : (pagina * quantidade));
			query.setMaxResults(quantidade);
		}
		
		if(nome != null && !"".equals(nome)) {
			query.setParameter("nome", "%" + nome + "%");
		}
		
		if(situacao != null && !"".equals(situacao)) {
			query.setParameter("situacao", situacao);
		}
		
		List<Sistema> list = query.getResultList();
		return list;
	}
	
	public Long obterTotal(String nome, Boolean situacao) {
		StringBuilder jpql = new StringBuilder();
		jpql.append("SELECT count(1) ");
		jpql.append("FROM Sistema sistema ");
		jpql.append("WHERE 1 = 1 ");
		
		if(nome != null && !"".equals(nome)) {
			jpql.append("AND sistema.nome LIKE :nome ");
		}
		
		if(situacao != null) {
			jpql.append("AND sistema.ativo = :situacao");
		}
		
		Query query = entityManager.createQuery(jpql.toString());
		
		if(nome != null && !"".equals(nome)) {
			query.setParameter("nome", "%" + nome + "%");
		}
		
		if(situacao != null && !"".equals(situacao)) {
			query.setParameter("situacao", situacao);
		}
		
		Long total = (Long) query.getSingleResult();
		return total;
	}
	
}