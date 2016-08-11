(function() {
	'use strict';
	
	angular.module('pesquisarSistemas').controller('PesquisarSistemasController', 
	['$scope', 'NgTableParams', 'PesquisarSistemasService', 'UIMessagesFactory',
	function($scope, NgTableParams, PesquisarSistemasService, UIMessagesFactory) {
		var self = this;
		
		self.messages = new UIMessagesFactory();
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
					
					if(params.total() == 0) {
						self.messages.info('Nenhum registro encontrado.');
					}
					
					return response.lista;
				});
			}
		});
		
		self.pesquisar = function() {
			self.messages.clear();
			
			if(self.filtro.nome && self.filtro.nome.length < 5) {
				self.messages.warning('Informe pelo menos 5 caracteres para efetuar a pesquisa pelo nome do sistema.', true);
				return;
			}
			
			self.tabelaSistemas.page(1);
			self.tabelaSistemas.reload();
			
			/*
			self.messages.info('Info');
			self.messages.warning('Warning');
			self.messages.success('Success');
			self.messages.error('Error', true);
			*/
		};
		
		self.limpar = function() {
			self.messages.clear();
			self.filtro = {};
		};
	}]);
})();