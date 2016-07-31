package br.com.lfcsystems.syscrum.negocio.pesquisarSistemas;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.lfcsystems.syscrum.domain.Sistema;

@Stateless
public class PesquisarSistemasBean implements PesquisarSistemasLocalNegocio {
	
	@Inject
	private PesquisarSistemasRepository repository;
	
	@Override
	public List<Sistema> pesquisar(String nome, Boolean situacao) {
		return repository.pesquisar(nome, situacao);
	}
}