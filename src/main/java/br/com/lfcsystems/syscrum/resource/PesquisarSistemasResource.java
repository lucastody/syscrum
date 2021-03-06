package br.com.lfcsystems.syscrum.resource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.lfcsystems.syscrum.domain.Sistema;
import br.com.lfcsystems.syscrum.negocio.pesquisarSistemas.PesquisarSistemasLocalNegocio;

@Path("/pesquisarSistemas")
public class PesquisarSistemasResource {
	
	@EJB
	private PesquisarSistemasLocalNegocio pesquisarSistemasLocalNegocio;
	
	@GET
	@Path("/pesquisar")
	@Produces(MediaType.APPLICATION_JSON)
	public Response pesquisar(
			@QueryParam("nome") String nome,
			@QueryParam("situacao") Boolean situacao,
			@QueryParam("pagina") Integer pagina,
			@QueryParam("quantidade") Integer quantidade) throws Exception {
		
		List<Sistema> sistemas = pesquisarSistemasLocalNegocio.pesquisar(pagina, quantidade, nome, situacao);
		Long total = pesquisarSistemasLocalNegocio.obterTotal(nome, situacao);
		
		Map<String, Object> resultado = new HashMap<>();
		resultado.put("lista", sistemas);
		resultado.put("total", total);
		
		return Response.ok(resultado).build();
	}
}