(function() {
	'use strict';
	
	angular.module('pesquisarSistemas').controller('PesquisarSistemasController', 
	['$scope', 'PesquisarSistemasService',
	function($scope, PesquisarSistemasService) {
		var self = this;
		
		self.filtro = {};
		self.sistemas = [];
		
		self.pesquisar = function() {
			PesquisarSistemasService.pesquisar(self.filtro).then(function(response) {
				self.sistemas = response;
			});
		};
		
		self.limpar = function() {
			self.filtro = {};
		};
	}]);
})();