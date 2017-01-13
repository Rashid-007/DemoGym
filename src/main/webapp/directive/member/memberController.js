(function (angular) {
    'use strict';
    angular.module('gymApp').controller('MemberController', memberController);

    memberController.$inject = ['$scope', 'MemberService'];

    function memberController($scope, MemberService) {
        $scope.findAllMembers = function () {
            MemberService.findAll().then(function (members) {
                $scope.members = members;
            });
        };

        $scope.findAllMembers();
    }
})(angular);