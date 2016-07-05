'use strict';

angular.module('app.user').controller('CreateUserController', 

['$rootScope', '$scope', '$location', 'UserService', 
 function($rootScope, $scope, $location, UserService) {
	
	$scope.create = function(user) {
		var usuario = new User(user.name, user.lastName);
		UserService.save(usuario);
		
		$location.path('/user/list');
		$scope.$emit('USER_CREATE', usuario);
		$scope.user = {};
	};
	
}]);