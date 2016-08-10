(function() {
	'use strict';
	
	angular.module('pesquisarSistemas').controller('PesquisarSistemasController', 
	['$scope', 'NgTableParams', 'PesquisarSistemasService',
	function($scope, NgTableParams, PesquisarSistemasService) {
		var self = this;
		
		self.filtro = {};
		
		var typeValidations = {
			'required': 'Este campo é obrigatório',
			'minlength': 'Este campo exige um valor mínimo'
		};
		
		self.getValidation = function(key) {
			return typeValidations[key];
		};
		
		self.tabelaSistemas = new NgTableParams({
			page: 1,
			count: 10
		}, {
			filterDelay: 300,
			counts: [10, 20, 30, 40],
			getData: function(params) {
				self.filtro.pagina = params.page() - 1;
				self.filtro.quantidade = params.count();
				
				return PesquisarSistemasService.pesquisar(self.filtro).then(function(response) {
					if(response.lista.length > response.total) {
						params.page(1);
					}
					
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