//package com.lucas.exemplo.services.impl;
//
//import javax.ejb.Stateless;
//import javax.jws.WebService;
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//
//import com.lucas.exemplo.services.HelloWorldLocalBusiness;
//import com.lucas.exemplo.services.HelloWorldWS;
//
//@Stateless
//@WebService(endpointInterface = "com.lucas.exemplo.services.HelloWorldWS")
//public class HelloWorldBean implements HelloWorldLocalBusiness, HelloWorldWS {
//	
//	@PersistenceContext(unitName = "syscrumPU")
//	private EntityManager entityManager;
//	
//	public void sayHelloWorld() {
//		System.out.println("Olá mundo ejb!!!");
//	}
//	
////	public void sayHelloTo(Pessoa pessoa) {
////		System.out.println("Olá " + pessoa.getNome());
////	}
////	
////	@Transactional
////	public void gravarPessoa(Pessoa pessoa) {
////		((Session) entityManager.getDelegate()).save(pessoa);
////	}
////	
////	@Transactional
////	public void deletePessoa(Long id) {
////		Pessoa pessoa = ((Session) entityManager.getDelegate()).load(Pessoa.class, id);
////		((Session) entityManager.getDelegate()).delete(pessoa);
////	}
//}