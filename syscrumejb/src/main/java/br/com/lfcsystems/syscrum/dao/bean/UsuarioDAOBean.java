package br.com.lfcsystems.syscrum.dao.bean;

import javax.ejb.Stateless;

import br.com.lfcsystems.syscrum.dao.UsuarioDAO;
import br.com.lfcsystems.syscrum.domain.Usuario;
import br.com.lfcsystems.syscrum.infra.AbstractRepository;

@Stateless
public class UsuarioDAOBean extends AbstractRepository<Usuario, Long> implements UsuarioDAO {
	
	
	
}