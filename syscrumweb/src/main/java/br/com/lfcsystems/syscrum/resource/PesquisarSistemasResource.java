package br.com.lfcsystems.syscrum.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.lfcsystems.syscrum.domain.Perfil;

@Path("/pesquisar-sistemas")
public class PesquisarSistemasResource {
	
	@GET
	@Path("/test")
	@Produces(MediaType.APPLICATION_JSON)
	public Response test(@QueryParam("codigo") Integer codigo) {
		System.out.println("Código: " + codigo);
		
		List<Perfil> perfis = new ArrayList<>();
		Perfil perfil = new Perfil();
		perfil.setId(1L);
		perfil.setNome("Perfil A");
		perfis.add(perfil);
		perfis.add(perfil);
		perfis.add(perfil);
		perfis.add(perfil);
		perfis.add(perfil);
		
		return Response.ok(perfis).build();
	}
}