package com.lucas.exemplo.services;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HelloWorldWS {
	
	@WebMethod
	void sayHelloWorld();
	
//	@WebMethod
//	void sayHelloTo(@WebParam(name = "pessoa") Pessoa pessoa);
//	
//	@WebMethod
//	void gravarPessoa(@WebParam(name = "pessoa") Pessoa pessoa);
	
//	@WebMethod
//	void deletePessoa(Long id);
	
}