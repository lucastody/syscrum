package br.com.lfcsystems.syscrum.negocio.cadastrarUsuario;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class CadastrarUsuarioBean implements CadastrarUsuarioLocalNegocio {
	
	@Inject
	private CadastrarUsuarioRepository repository;
	
	@Override
	public void findAll() {
		repository.testar();
	}
}