package br.com.lfcsystems.syscrum.negocio.cadastrarUsuario;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class CadastrarUsuarioBean implements CadastrarUsuarioNegocio {
	
	@EJB
	private CadastrarUsuarioRepository repository;
	
	@Override
	public void findAll() {
		repository.findAll();
	}
}