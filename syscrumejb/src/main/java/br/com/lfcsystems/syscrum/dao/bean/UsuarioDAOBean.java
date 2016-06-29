package br.com.lfcsystems.syscrum.dao.bean;

import javax.ejb.Stateless;

import br.com.lfcsystems.syscrum.dao.UsuarioDAO;
import br.com.lfcsystems.syscrum.domain.Usuario;
import br.com.lfcsystems.syscrum.infra.AbstractCrudRepository;

@Stateless
public class UsuarioDAOBean extends AbstractCrudRepository<Usuario, Long> implements UsuarioDAO {
	
	
	
}