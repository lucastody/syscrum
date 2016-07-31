(function() {
	'use strict';
	
	angular.module('directives').directive('switch', function() {
		return {
			restrict: 'E',
			require: '^ngModel',
			replace: true,
			templateUrl: 'directives/switch/switch.tpl.html',
			scope: {
				ngModel: '=ngModel',
				ngDisabled: '=ngDisabled'
			},
			link: function($scope, $el, $attrs, $ctrl) {
				$el.bootstrapSwitch({
					onText: 'Ativo', offText: 'Inativo'
				});
				
				$scope.$watch('ngDisabled', function(newValue, oldValue) {
					$el.bootstrapSwitch('disabled', $scope.ngDisabled);
				});
				
				$scope.$watch('ngModel', function(newValue, oldValue) {
					if(newValue == undefined) {
						$el.bootstrapSwitch('indeterminate', true);
					}
				});
				
				$el.on('switchChange.bootstrapSwitch', function(event, state) {
					$scope.ngModel = state;
					$scope.$apply($scope.ngModel);
				});
			}
		};
	});
})();