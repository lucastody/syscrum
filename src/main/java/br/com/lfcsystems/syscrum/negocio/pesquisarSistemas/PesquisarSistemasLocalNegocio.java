package br.com.lfcsystems.syscrum.negocio.pesquisarSistemas;

import java.util.List;

import javax.ejb.Local;

import br.com.lfcsystems.syscrum.domain.Sistema;

@Local
public interface PesquisarSistemasLocalNegocio {
	
	List<Sistema> pesquisar(Integer pagina, Integer quantidade, String nome, Boolean situacao) throws Exception;
	Long obterTotal(String nome, Boolean situacao);
	
}