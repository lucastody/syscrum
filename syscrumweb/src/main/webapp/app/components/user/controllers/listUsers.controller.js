'use strict';

angular.module('app.user').controller('ListUserController', 
['$rootScope', '$scope', '$location', 'UserService', 'testeConteudoFactory',
function($rootScope, $scope, $location, UserService, testeConteudoFactory) {
	
	$rootScope.$on('USER_CREATE', function(e, data) {
		console.log('Foi criado um novo usuário! Nome: ' + data.name);
	});
	
	$scope.users = UserService.loadAll();
	$scope.selectedUser = null;
	
	$scope.alterarConteudo = function() {
		$scope.myMessage.setMessage('teste');
	};
	
	$scope.selectChange = function() {
		console.log('ok: ' + $scope.selectedUser);
	};
	
	$scope.listaAutocomplete = [{
		codigo: 1, nome: 'A'
	}, {
		codigo: 2, nome: 'B'
	}, {
		codigo: 3, nome: 'C'
	}, {
		codigo: 4, nome: 'D'
	}];
	
	$scope.itemAutocomplete = null;
	
	$scope.limparAutocomplete = function() {
		$scope.itemAutocomplete = null;
	};
}]);