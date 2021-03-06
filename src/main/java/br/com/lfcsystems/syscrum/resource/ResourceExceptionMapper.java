package br.com.lfcsystems.syscrum.resource;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ResourceExceptionMapper implements ExceptionMapper<Exception> {

	@Override
	public Response toResponse(Exception exception) {
		return Response.status(Response.Status.BAD_REQUEST).entity(exception).build(); 
	}

}
