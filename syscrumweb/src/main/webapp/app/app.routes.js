(function(angular) {
	'use strict';

	angular.module('app').config(['$routeProvider', function($routeProvider) {
		
		$routeProvider.when('/pesquisarSistemas', {
			templateUrl: 'components/pesquisarSistemas/pages/pesquisa.view.html',
			controller: 'PesquisarSistemasController',
			controllerAs: 'ctrl'
		});
		
	}]);
})(angular);