
var app = angular.module("productListModule", ['mainService']);

app.controller('productListCtrl', ['globalService', '$scope', function (globalService, $scope) {
	console.log("productListCtrl");
	globalService.httpRequest("POST", "productList", "").then(function(response){
		
		
		console.log(response);
		
		
		$scope.productList = response.data;
	},function(){
		console.log("error");
	});
}]);