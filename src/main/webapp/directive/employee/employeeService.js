(function (angular) {
    'use strict';
    angular.module('gymApp').service('EmployeeService', employeeService);

    employeeService.$inject = ['$q', '$http'];

    function employeeService($q, $http) {

        this.findAll = function () {
            var defer = $q.defer();

            $http.get('/api/employees').then(function(employees){
                defer.resolve(employees.data);
            }).catch(function () {
                defer.reject("Error Getting Employees");
            });

            return defer.promise;
        }

    }
})(angular);