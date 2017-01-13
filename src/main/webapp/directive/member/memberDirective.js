(function (angular) {
    'use strict';
    angular.module('gymApp').directive('memberTable', memberTable);

    function memberTable() {
        return{
            restrict: 'AE',
            replace: 'true',
            templateUrl: 'directive/member/member.html',
            controller: 'MemberController'
        }
    }
})(angular);