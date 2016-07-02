package br.com.lfcsystems.syscrum.negocio.cadastrarSistema;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.lfcsystems.syscrum.domain.Sistema;

@Stateless
public class CadastrarSistemaBean implements CadastrarSistemaLocalNegocio {
	
	@EJB
	private CadastrarSistemaRepository repository;
	
	@Override
	public List<Sistema> listarSistemasAtivos() {
		return repository.listarSistemasAtivos();
	}
}