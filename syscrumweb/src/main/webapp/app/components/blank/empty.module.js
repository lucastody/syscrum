'use strict';

angular.module('app.blank', [
])

.config(['$routeProvider', function($routeProvider) {
	$routeProvider.when('/blank', {
		redirectTo: '/blank/empty'
	});
	
	$routeProvider.when('/blank/empty', {
		templateUrl: '../../app/components/blank/pages/empty.view.html',
		controller: 'EmptyController'
	});
	
	$routeProvider.otherwise({
		redirectTo: '/blank'
	});
}]);