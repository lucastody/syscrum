'use strict';

angular.module('app').factory('PesquisarSistemasService', ['$http', function($http) {
	return {
		test: function() {
			return $http.get('/syscrumweb/rest/pesquisar-sistemas/test', {
				params: {
					codigo: 123
				}
			}).then(function(response) {
				console.log('Foram retornados ' + response.data.length + ' registro(s).');
				return response;
			});
		}
	};
}]);