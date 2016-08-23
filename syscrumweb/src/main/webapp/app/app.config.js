(function(angular) {
	'use strict';
	
	angular.module('app')
	
	.config(['$provide', '$httpProvider', function ($provide, $httpProvider) {
		$provide.factory('MyHttpInterceptor', ['$q', '$injector', function($q, $injector) {
			var $http;
			
			return {
				request: function (config) {
					$http = $http || $injector.get('$http');
					
					if($http.pendingRequests.length > 0) {
						$.blockUI({
							message: 'Aguarde...'
						});
					}
					
					return config || $q.when(config);
				},
				
				requestError: function (rejection) {
					$.unblockUI();
					return $q.reject(rejection);
				},
				
				response: function (response) {
					$http = $http || $injector.get('$http');
					
					if($http.pendingRequests.length < 1) {
						$.unblockUI();
					}
					
					return response || $q.when(response);
				},
				
				responseError: function (rejection) {
					$.unblockUI();
					
					if(rejection.status == 500) {
						console.log('Server Internal Error');
						return;
					}
					
					return $q.reject(rejection);
				}
			};
		}]);
		
		$httpProvider.interceptors.push('MyHttpInterceptor');
	}])
	
	.run(function() {
		
	});
})(angular);