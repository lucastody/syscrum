package br.com.lfcsystems.syscrum.dao;

import javax.ejb.Local;

import br.com.lfcsystems.syscrum.domain.Usuario;
import br.com.lfcsystems.syscrum.infra.GenericDAO;

@Local
public interface UsuarioDAO extends GenericDAO<Usuario, Long> {
	
	
	
}