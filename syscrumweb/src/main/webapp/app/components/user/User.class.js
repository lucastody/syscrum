'use strict';

angular.module('app.user').factory('User', function() {
	function User(nome, sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	User.prototype.nomeCompleto = function() {
		return this.nome + ' / ' + this.sobrenome;
	};
	
	return User;
});
