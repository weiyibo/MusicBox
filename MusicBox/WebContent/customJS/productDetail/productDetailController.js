
var app = angular.module("productDetailModule", []);
app.controller('productDetailCtrl', function($scope, $routeParams, globalService){
	
	console.log("productDetailCtrl");
	$scope.request = {productId: $routeParams.productId};
	
	globalService.httpRequest("POST", "productDetail", $scope.request).then(function(response){
		$scope.product = response.data;
	}, function(){
		console.log("error");
	});
	
	
});