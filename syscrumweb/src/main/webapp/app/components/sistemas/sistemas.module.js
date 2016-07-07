'use strict';

angular.module('sistemas', [
])

.config(['$routeProvider', function($routeProvider) {
	$routeProvider.when('/sistemas', {
		redirectTo: '/sistemas/pesquisar'
	});
	
	$routeProvider.when('/sistemas/pesquisar', {
		templateUrl: 'components/sistemas/pages/pesquisa.view.html',
		controller: 'PesquisarController',
		controllerAs: 'ctrl'
	});
	
	$routeProvider.when('/sistemas/incluir', {
		templateUrl: 'components/sistemas/pages/incluir.view.html',
		controller: 'IncluirController',
		controllerAs: 'ctrl'
	});
	
	$routeProvider.otherwise({
		redirectTo: '/sistemas/pesquisar'
	});
}]);