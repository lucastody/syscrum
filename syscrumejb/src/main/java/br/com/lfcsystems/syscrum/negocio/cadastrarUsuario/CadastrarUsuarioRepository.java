package br.com.lfcsystems.syscrum.negocio.cadastrarUsuario;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.lfcsystems.syscrum.dao.UsuarioDAO;
import br.com.lfcsystems.syscrum.infra.AbstractRepository;

@Stateless
public class CadastrarUsuarioRepository extends AbstractRepository {
	
	@EJB
	private UsuarioDAO usuarioDAO;
	
	public void testar() {
		usuarioDAO.findAll();
	}
	
}