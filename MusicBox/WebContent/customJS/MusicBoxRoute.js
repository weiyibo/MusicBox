var app = angular.module("myApp", ['ngRoute', 'homePageModule', 'productListModule', 'productDetailModule', 'angular.backtop', 'mainModule']);
app.config(['$routeProvider',function($routeProvider) {
    $routeProvider
    .when('/', {
        templateUrl : 'view/home.jsp',
        controller  : 'homeCtrl'
    })
    .when("/ProductList", {
    	 templateUrl : 'view/productList.jsp',
         controller  : 'productListCtrl'
    })
    .when("/ProductDetail/:productId", {
   	 	templateUrl : 'view/productDetails.jsp',
        controller  : 'productDetailCtrl'
   });
//   .when("/login", {
//	   	 templateUrl : 'view/productDetails.jsp',
//	     controller  : 'loginCtrl'
//	})
//	.when("/register", {
//	   	 templateUrl : '',
//	     controller  : 'productDetailCtrl'
//	});
    
}]);

