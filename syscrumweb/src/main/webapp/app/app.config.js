(function(angular) {
	'use strict';
	
	angular.module('app')
	
	.config(['$httpProvider', function ($httpProvider) {
		var $http, interceptor = ['$q', '$injector', function ($q, $injector) {
			var error;
			
			function success(response) {
				console.log('ok');
				return response;
			}
			
			function error(response) {
				return $q.reject(response);
			}
			
			function finn() {
				$http = $http || $injector.get('$http');
				
				if($http.pendingRequests.length < 1) {
					// $('#loadingWidget').hide();
					console.log('terminou');
				}
			}
			
			return function (promise) {
				//$('#loadingWidget').show();
				console.log('iniciou');
				return promise.then(success, error, finn);
			}
		}];
		
		$httpProvider.interceptors.push(['$q', '$injector', function($q, $injector) {
			var $http;
			
			return {
				'request': function(config) {
					$http = $http || $injector.get('$http');
					
					if($http.pendingRequests.length > 0) {
						$.blockUI({
							message: 'Aguarde...'
						});
					}
					
					return config;
				},
				
				'requestError': function(rejection) {
					$.unblockUI();
					return $q.reject(rejection);
				},
				
				'response': function(response) {
					$http = $http || $injector.get('$http');
					
					if($http.pendingRequests.length < 1) {
						$.unblockUI();
					}
					
					return response;
				},
				
				'responseError': function(rejection) {
					$.unblockUI();
					return $q.reject(rejection);
				}
			};
		}]);
	}])
	
	.run(function() {
		
	});
})(angular);