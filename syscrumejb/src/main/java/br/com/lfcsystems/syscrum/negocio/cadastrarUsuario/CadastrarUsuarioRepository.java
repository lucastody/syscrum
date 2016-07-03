package br.com.lfcsystems.syscrum.negocio.cadastrarUsuario;

import javax.inject.Inject;

import br.com.lfcsystems.syscrum.dao.UsuarioDAO;
import br.com.lfcsystems.syscrum.infra.AbstractRepository;

public class CadastrarUsuarioRepository extends AbstractRepository {
	
	@Inject
	private UsuarioDAO usuarioDAO;
	
	public void testar() {
		usuarioDAO.findAll();
	}
	
}