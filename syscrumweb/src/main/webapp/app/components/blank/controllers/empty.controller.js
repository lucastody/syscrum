'use strict';

angular.module('app.blank').controller('EmptyController', 

['$rootScope', '$scope', '$location', 'PesquisarSistemasService',
function($rootScope, $scope, $location, PesquisarSistemasService) {
	var self = this;
	
	self.test = function() {
		PesquisarSistemasService.test().then(function(response) {
			console.log(response);
		}, function(error) {
			console.log(error);
		});
	};
	
}]);