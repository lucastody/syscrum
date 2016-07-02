package br.com.lfcsystems.syscrum.negocio.cadastrarSistema;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.lfcsystems.syscrum.dao.SistemaDAO;
import br.com.lfcsystems.syscrum.domain.Sistema;
import br.com.lfcsystems.syscrum.infra.AbstractRepository;

@Stateless
public class CadastrarSistemaRepository extends AbstractRepository {
	
	@EJB
	private SistemaDAO sistemaDAO;
	
	public List<Sistema> listarSistemasAtivos() {
		return sistemaDAO.listarAtivos();
	}
	
}