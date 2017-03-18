(function() {
	'use strict';
	
	angular.module('directives')
	
	.factory('UIMessagesFactory', function() {
		return function() {
			var messages = [];
			
			function fnInfo(message, dismissible) {
				addMessage(message, dismissible, 'info', 'alert-info', 'fa-info');
			};
			
			function fnWarning(message, dismissible) {
				addMessage(message, dismissible, 'warning', 'alert-warning', 'fa-warning');
			};
			
			function fnSuccess(message, dismissible) {
				addMessage(message, dismissible, 'success', 'alert-success', 'fa-check');
			};
			
			function fnError(message, dismissible) {
				addMessage(message, dismissible, 'error', 'alert-danger', 'fa-ban');
			};
			
			function addMessage(message, dismissible, type, css, cssIcon) {
				messages.push({
					message: message,
					dismissible: dismissible || false,
					type: type,
					css: css,
					cssIcon: cssIcon
				});
			};
			
			function fnClear() {
				messages = [];
			};
			
			function fnGetMessages() {
				return messages;
			};
			
			return {
				messages: fnGetMessages,
				clear: fnClear,
				info: fnInfo,
				warning: fnWarning,
				success: fnSuccess,
				error: fnError
			}
		};
	})
	
	.directive('uiMessages', function() {
		return {
			restrict: 'EA',
			replace: true,
			templateUrl: 'directives/uiMessages/uiMessages.tpl.html',
			scope: {
				factory: '='
			},
			link: function($scope, $el, $attrs) {
				
			}
		};
	});
})();