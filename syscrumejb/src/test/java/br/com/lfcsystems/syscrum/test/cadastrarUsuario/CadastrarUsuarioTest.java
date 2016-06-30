package br.com.lfcsystems.syscrum.test.cadastrarUsuario;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.junit.Before;
import org.junit.Test;

import br.com.lfcsystems.syscrum.negocio.cadastrarUsuario.CadastrarUsuarioLocalNegocio;

public class CadastrarUsuarioTest {
	private CadastrarUsuarioLocalNegocio cadastrarUsuarioLocalNegocio;
	
	@Before
	public void bootContainer() throws Exception {
		Context context = new InitialContext();
		cadastrarUsuarioLocalNegocio = (CadastrarUsuarioLocalNegocio) context.lookup("CadastrarUsuarioBeanLocal");
	}
	
	@Test
	public void cadastrarNovoUsuarioComSucesso() {
		cadastrarUsuarioLocalNegocio.findAll();
	}
}