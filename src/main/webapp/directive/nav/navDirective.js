(function (angular) {
    'use strict';
    angular.module('gymApp').directive('navBar', navBar);

    function navBar() {
        return{
            restrict: 'AE',
            replace: 'true',
            templateUrl: 'directive/nav/nav.html'
        }
    }
})(angular);