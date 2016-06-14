var app = angular.module("mainModule", []);
app.controller('mainCtrl', function( $scope, globalService){
	console.log("login123");
	$scope.login = function(){
		
		console.log("in");
		return globalService.popUpWindow($scope, "view/login.jsp");
	};
	
});