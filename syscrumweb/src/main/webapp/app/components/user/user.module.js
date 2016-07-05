'use strict';

angular.module('app.user', [
	'customTableDirective',
	'comboboxDirective',
	'directiveTesteConteudo',
	'autocompleteDirective',
	'testeDirective',
	'testeCompileDirective'
])

.config(['$routeProvider', function($routeProvider) {
	$routeProvider.when('/user', {
		redirectTo: '/user/list'
	});
	
	$routeProvider.when('/user/create', {
		templateUrl: 'app/components/user/pages/createUser.view.html',
		controller: 'CreateUserController'
	});
	
	$routeProvider.when('/user/list', {
		templateUrl: 'app/components/user/pages/listUsers.view.html'
	});
	
	$routeProvider.otherwise({
		redirectTo: '/user'
	});
}]);