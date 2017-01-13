(function (angular) {
    'use strict';
    angular.module('gymApp').directive('employeeTable', employeeTable);

    function employeeTable() {
        return{
            restrict: 'AE',
            replace: 'true',
            templateUrl: 'directive/employee/employee.html',
            controller: 'EmployeeController'
        }
    }
})(angular);