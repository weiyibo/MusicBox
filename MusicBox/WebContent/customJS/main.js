var app = angular.module("mainService",['ui.bootstrap']);

app.service('globalService', function($uibModal, $http){
	this.httpRequest= function(method, url, data){
		console.log("send");
		return $http({
			method: method,
			url: url,
			data: data,
			headers: {
				"Content-Type": "application/json"
			}
		}).then(function(response){
			return response;
		}, function(error){
			return null;
		});
	};
	
	this.popUpWindow = function($scope, url){
		modalInstance  = $uibModal.open({
			templateUrl: url,
			scope: $scope,
		});
		return modalInstance;
	};
	
	
});