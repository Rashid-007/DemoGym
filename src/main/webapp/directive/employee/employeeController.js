(function (angular) {
    'use strict';
    angular.module('gymApp').controller('EmployeeController', employeeController);

    employeeController.$inject = ['$scope', 'EmployeeService'];

    function employeeController($scope, EmployeeService) {
        $scope.findAllEmployees = function () {
            EmployeeService.findAll().then(function (employees) {
                $scope.employees = employees;
            });
        };

        $scope.findAllEmployees();
    }
})(angular);