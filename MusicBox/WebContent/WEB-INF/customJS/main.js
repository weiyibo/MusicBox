var app = angular.module("myApp", []);
//app.controller('mainCtrl', function($scope){
//	console.log("home");
//});

app.directive('naviDirective', function(){
	return {
		retstrict: 'EA',
		templateUrl: 'view/header.jsp',
		controller: function(){
			 console.log("de");
		 }
	};
	
});