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
            .otherwise({redirectTo: '/home'})
    }
})(angular);