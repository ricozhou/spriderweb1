'use strict';

var app = angular.module('app', [ 'ngRoute', 'ngResource', ]);

app.config([ '$routeProvider', function($routeProvider) {
	$routeProvider.when('/signin', {
		templateUrl : 'commonviews/signin.html',
		controller : 'signinCtrl'
	});
	$routeProvider.when('/signup', {
		templateUrl : 'commonviews/signup.html',
		controller : 'signupCtrl'
	});
	$routeProvider.when('/home', {
		templateUrl : 'board/home.html',
		controller : 'homeCtrl'
	});
	$routeProvider.otherwise({
		redirectTo : '/signin'
	});

} ]);

app.run([ '$rootScope', '$resource', function($rootScope, $resource) {
	$rootScope.user = {};
} ]);