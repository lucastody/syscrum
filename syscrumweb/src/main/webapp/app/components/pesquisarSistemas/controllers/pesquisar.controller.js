(function() {
	'use strict';
	
	angular.module('pesquisarSistemas').controller('PesquisarSistemasController', 
	['$scope', 'NgTableParams', 'PesquisarSistemasService',
	function($scope, NgTableParams, PesquisarSistemasService) {
		var self = this;
		
		self.filtro = {};
		
		self.tabelaSistemas = new NgTableParams({
			page: 1,
			count: 5
		}, {
			filterDelay: 300,
			getData: function(params) {
				self.filtro.pagina = params.page() - 1;
				self.filtro.quantidade = params.count();
				
				return PesquisarSistemasService.pesquisar(self.filtro).then(function(response) {
					params.total(response.total);
					return response.lista;
				});
			}
		});
		
		self.pesquisar = function() {
			self.tabelaSistemas.page(1);
			self.tabelaSistemas.reload();
		};
		
		self.limpar = function() {
			self.filtro = {};
		};
	}]);
})();