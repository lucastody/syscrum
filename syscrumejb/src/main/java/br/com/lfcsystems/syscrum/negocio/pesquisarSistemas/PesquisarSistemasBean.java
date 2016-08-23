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
	public List<Sistema> pesquisar(Integer pagina, Integer quantidade, String nome, Boolean situacao) throws Exception {
		new Integer("adf");
		
		if(1 == 1) {
			throw new Exception("Erro!");
		}
		
		return repository.pesquisar(pagina, quantidade, nome, situacao);
	}

	@Override
	public Long obterTotal(String nome, Boolean situacao) {
		return repository.obterTotal(nome, situacao);
	}
}