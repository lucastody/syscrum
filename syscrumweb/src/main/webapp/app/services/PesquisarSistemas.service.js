'use strict';

angular.module('app').factory('PesquisarSistemasService', ['$http', function($http) {
	return {
		pesquisar: function(filtro) {
			return $http.get('/syscrumweb/rest/pesquisarSistemas/pesquisar', {
				params: filtro
			}).then(function(response) {
				return response.data;
			});
		}
	};
}]);