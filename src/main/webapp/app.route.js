(function (angular) {
    'use strict';
    angular.module('gymApp').config(config);

    config.$inject = ['$routeProvider'];

    function config($routeProvider) {
        $routeProvider
            .when('/home', {
                templateUrl: 'partial/home/home.html',
                controller: 'HomeController'
            })
            .when('/about', {
                templateUrl: 'partial/about/about.html'
            })
            .when('/signUp', {
                templateUrl: 'partial/signUp/signUp.html'
            })
            .when('/classes', {
                templateUrl: 'partial/classes/classes.html'
            })
            .when('/PT', {
                templateUrl: 'partial/personalTraining/personalTraining.html'
            })
            .when('/admin', {
                templateUrl: 'partial/logIn/admin.html'
            })
            .otherwise({redirectTo: '/home'})
    }
})(angular);