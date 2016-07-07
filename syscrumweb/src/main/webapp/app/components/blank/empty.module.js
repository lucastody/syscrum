'use strict';

angular.module('blank', [
])

.config(['$routeProvider', function($routeProvider) {
	$routeProvider.when('/blank', {
		redirectTo: '/blank/empty'
	});
	
	$routeProvider.when('/blank/empty', {
		templateUrl: 'components/blank/pages/empty.view.html',
		controller: 'EmptyController',
		controllerAs: 'ctrl'
	});
	
	$routeProvider.otherwise({
		redirectTo: '/blank'
	});
}]);