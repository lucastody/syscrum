package br.com.lfcsystems.syscrum.negocio.cadastrarSistema;

import java.util.List;

import javax.inject.Inject;

import br.com.lfcsystems.syscrum.dao.SistemaDAO;
import br.com.lfcsystems.syscrum.domain.Sistema;
import br.com.lfcsystems.syscrum.infra.AbstractRepository;

public class CadastrarSistemaRepository extends AbstractRepository {
	
	@Inject
	private SistemaDAO sistemaDAO;
	
	public List<Sistema> listarSistemasAtivos() {
		return sistemaDAO.listarAtivos();
	}
	
}