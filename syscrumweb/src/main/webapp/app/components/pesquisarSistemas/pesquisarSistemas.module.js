'use strict';

angular.module('pesquisarSistemas', [
])

.config(['$routeProvider', function($routeProvider) {
	$routeProvider.when('/pesquisarSistemas', {
		templateUrl: 'components/pesquisarSistemas/pages/pesquisa.view.html',
		controller: 'PesquisarController',
		controllerAs: 'ctrl'
	});
}]);