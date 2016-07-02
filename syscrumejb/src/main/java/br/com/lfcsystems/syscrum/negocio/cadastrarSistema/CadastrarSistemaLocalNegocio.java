package br.com.lfcsystems.syscrum.negocio.cadastrarSistema;

import java.util.List;

import javax.ejb.Local;

import br.com.lfcsystems.syscrum.domain.Sistema;

@Local
public interface CadastrarSistemaLocalNegocio {
	
	List<Sistema> listarSistemasAtivos();
	
}