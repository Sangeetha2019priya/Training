demo.controller('myController', function ($scope, demoService, defaultInput) {
    $scope.number = defaultInput;
    $scope.result = demoService.addition($scope.number);

    $scope.addition = function () {
        $scope.result = demoService.addition($scope.number);
    }
});
