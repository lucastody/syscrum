'use strict';

angular.module('app.blank').factory('EmptyService', ['$http', function($http) {
	return {
		loadAll: function() {
			return [];
		}
	};
}]);