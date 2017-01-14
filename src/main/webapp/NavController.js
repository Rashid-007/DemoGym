(function (angular) {
    'use strict';
    angular.module('gymApp').controller('NavController', navController);
    
    navController.$inject = ['$scope'];
    
    function navController($scope) {
        $scope.admin = false;
    }
})(angular);