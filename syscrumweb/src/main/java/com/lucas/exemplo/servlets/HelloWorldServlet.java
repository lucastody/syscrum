package com.lucas.exemplo.servlets;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lucas.exemplo.services.HelloWorldLocalBusiness;

import br.com.lfcsystems.syscrum.negocio.cadastrarUsuario.CadastrarUsuarioNegocio;

public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private HelloWorldLocalBusiness helloWorld;
	
	@EJB
	private CadastrarUsuarioNegocio cadastrarUsuarioNegocio;

	public HelloWorldServlet() {
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		helloWorld.sayHelloWorld();
		cadastrarUsuarioNegocio.findAll();
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
}