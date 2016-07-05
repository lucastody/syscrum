'use strict';

angular.module('app.user').factory('UserService', ['$http', 'User', function($http, User) {
	var users = [];
	
	function init() {
		users.push(new User('AAA', '111'));
		users.push(new User('BBB', '222'));
		users.push(new User('CCC', '333'));
		users.push(new User('DDD', '444'));
		users.push(new User('EEE', '555'));
	}
	
	init();
	
	return {
		loadAll: function() {
			return users;
		},
	
		save: function(user) {
			users.push(user);
		}
	};
}]);