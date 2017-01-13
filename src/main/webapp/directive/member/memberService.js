(function (angular) {
    'use strict';
    angular.module('gymApp').service('MemberService', memberService);

    memberService.$inject = ['$q', '$http'];

    function memberService($q, $http) {

        this.findAll = function () {
            var defer = $q.defer();

            $http.get('/api/members').then(function(members){
                defer.resolve(members.data);
            }).catch(function () {
                defer.reject("Error Getting Members");
            });

            return defer.promise;
        }

    }
})(angular);